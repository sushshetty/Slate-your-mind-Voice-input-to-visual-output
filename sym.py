import speech_recognition as sr
from googletrans import Translator
import nltk
from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize, sent_tokenize

def Listen():
    r = sr.Recognizer()
    langDict = {'English': "en-US", 'Tamil': "ta-IN", 'Kannada': "kn-IN", 'Malayalam': "ml-IN", 'Bengali': "bn",
                'Gujarati': "IN", 'Hindi': "hi", 'Marathi': "mr", 'Punjabi': "pa", 'Telugu': "te", "Urdu":"ur"}
    with sr.Microphone() as source:
        print("Choose Language! Your options are, English, Tamil, Kannada and Malayalam")
        audio1 = r.listen(source)
        lang = r.recognize_google(audio1, language="en-US")
        print(r.recognize_google(audio1, language="en-US"))
        print("Thank you!")
    lang_code = langDict.get(lang)
    print(lang_code)
    with sr.Microphone() as source:
        print("I'm listening!")
        audio = r.listen(source)
        print('Done!')
    toEnglish(audio,lang_code)

def toEnglish(audio,lang_code):
    global E_Text
    r = sr.Recognizer()
    text = r.recognize_google(audio, language=lang_code)
    translator = Translator()
    translated = translator.translate(text, dest='en')
    print(translated.origin + "->" + translated.text)
    E_Text = translated.text
    extractWord(E_Text)

def extractWord(txt):
    stop_words = set(stopwords.words('english'))
    tokenized = sent_tokenize(txt)
    is_noun = lambda pos: pos[:2] == 'NN'
    is_verb = lambda pos: pos[:2] == 'VB'
    for i in tokenized:
        wordsList = nltk.word_tokenize(i)
        wordsList = [w for w in wordsList if not w in stop_words]
        # tagged = nltk.pos_tag(wordsList)
        # print(tagged)
        object = [word for (word, pos) in nltk.pos_tag(wordsList) if is_noun(pos)]
        print(object)
        action = [word for (word, pos) in nltk.pos_tag(wordsList) if is_verb(pos)]
        print(action)
    f1 = open("object.txt","w")
    f2 = open("action.txt","w")
    for x in range(len(object)):
        f1.write(object[x])
        f1.write("\n")
    for x in range(len(action)):
        f2.write(action[x])
        f2.write("\n")
    f1.close()
    f2.close()

Listen()
