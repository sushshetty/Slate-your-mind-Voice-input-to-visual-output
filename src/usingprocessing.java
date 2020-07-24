import processing.core.PApplet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import cbl.quickdraw.*;

public class usingprocessing extends PApplet {
	//private static BufferedReader br;
	
	int m,o=0;
	int[] xc;
	int[] yc;	
	int screen_height=800,screen_width=800;
		
	int objh=80,objw=80;
    int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0,flag10=0;
	QuickDraw qd1,qd3,qd2,qd6,qd4,qd5,qd7,qd8,qd9,qd10;
	static String object;
	  String[] objarr = new String[10]; 
      String[] actarr = new String[10];
      
      
	float end, w;
	String prefix = "full_simplified_";
	String x = ".ndjson";
	String y;
	private static Scanner z;

	public static void main(String[] args) {
		z = new Scanner(System.in);
		PApplet.main("usingprocessing");
	}

	public void settings() {
		size(screen_width, screen_height);
	}

	public void setup() {
		
		for (o=0;o<10;o++) {
			objarr[o] = "abcd";
			actarr[o] = "abcd";
			
		}
		
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("cmd.exe /c start python \\sym.py");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   try {
			p.waitFor();
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
		
		  
       
        int i=0;
		File file = new File("object.txt"); 
	     BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	     //String st; 
	     try {
	    	 String line = br.readLine();
             
				while (line != null) {
					objarr[i]=line;
	                i++;
					// read next line
					line = br.readLine();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	     File file1 = new File("action.txt"); 
	     BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(new FileReader(file1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	     int j=0;
	     try {String line2 = br1.readLine();
         
			while (line2 != null) {
				
				actarr[j]=line2;
                j++;
				// read next line
				line2 = br1.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	     
	     if(objarr[0]!="abcd") {
	    	 flag1=1;
		y = prefix + objarr[0] + x;
		qd1 = new QuickDraw(this, y);
	     }
		
	     if(objarr[1]!="abcd"){
	    	 flag2=1;
		y = prefix + objarr[1] + x;
		qd2 = new QuickDraw(this, y);
		}
	     //----/
	     if(objarr[2]!="abcd"){
	    	 flag3=1;
		y = prefix + objarr[2] + x;
		qd3 = new QuickDraw(this, y);
		}
	     
	     if(objarr[3]!="abcd"){
	    	 flag4=1;
		y = prefix + objarr[3] + x;
		qd4 = new QuickDraw(this, y);
		}
	     
	     if(objarr[4]!="abcd"){
	    	 flag5=1;
		y = prefix + objarr[4] + x;
		qd5 = new QuickDraw(this, y);
		}
	     
	     if(objarr[5]!="abcd"){
	    	 flag6=1;
		y = prefix + objarr[5] + x;
		qd6 = new QuickDraw(this, y);
		}
	     
	     if(objarr[6]!="abcd"){
	    	 flag7=1;
		y = prefix + objarr[6] + x;
		qd7 = new QuickDraw(this, y);
		}
	     
	     if(objarr[7]!="abcd"){
	    	 flag8=1;
		y = prefix + objarr[7] + x;
		qd8 = new QuickDraw(this, y);
		}
	     
	     if(objarr[8]!="abcd"){
	    	 flag9=1;
		y = prefix + objarr[8] + x;
		qd9 = new QuickDraw(this, y);
		}
	     
	     if(objarr[9]!="abcd"){
	    	 flag10=1;
		y = prefix + objarr[9] + x;
		qd10 = new QuickDraw(this, y);
		}
	     
	     /*-
	      * 
	      * 
		y = prefix + objarr[2] + x;
		qd3 = new QuickDraw(this, y);---*/
	     
	     
	     
	     
	     
	     
	}

	private void assertTrue(boolean exists) {
		// TODO Auto-generated method stub
		
	}

	
	Movement movement1 = new Movement(350,200,m);
	Movement movement2 = new Movement(275,350,m);
	Movement movement3 = new Movement(475,300,m);
	Movement movement4 = new Movement(350,200,m);
	Movement movement5 = new Movement(275,350,m);
	Movement movement6 = new Movement(475,300,m);
	Movement movement7 = new Movement(350,200,m);
	Movement movement8 = new Movement(275,350,m);
	Movement movement9 = new Movement(475,300,m);
	Movement movement10 = new Movement(475,300,m);

	public void draw() {
		background(255);
		//action=actarr[0];
		//action1=actarr[1];
		//action2=actarr[2];
		switch (actarr[0]) {
		case "fly down": {
			movement1.movedown();
		}
		case "fly up": {
			movement1.moveup();
		}
		case "fly right": {
			movement1.moveright();
		}
		case "fly left": {
			movement1.moveleft();
		}
		default: {
			x=x+0;
			y=y+0;
		}
		}
		//movement1.display1();
		

		switch (actarr[1]) {
		case "down": {
			movement2.movedown();
			break;
		}
		case "up": {
			movement2.moveup();
			break;
		}
		case "right": {
			movement2.moveright();
			break;
		}
		case "left": {
			movement2.moveleft();
			break;
		}
		case "random": {
			movement2.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[2]) {
		case "down": {
			movement3.movedown();
			break;
		}
		case "up": {
			movement3.moveup();
			break;
		}
		case "right": {
			movement3.moveright();
			break;
		}
		case "left": {
			movement3.moveleft();
			break;
		}
		case "random": {
			movement3.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		
		///--/
		switch (actarr[3]) {
		case "down": {
			movement4.movedown();
			break;
		}
		case "up": {
			movement4.moveup();
			break;
		}
		case "right": {
			movement4.moveright();
			break;
		}
		case "left": {
			movement4.moveleft();
			break;
		}
		case "random": {
			movement4.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[4]) {
		case "down": {
			movement5.movedown();
			break;
		}
		case "up": {
			movement5.moveup();
			break;
		}
		case "right": {
			movement5.moveright();
			break;
		}
		case "left": {
			movement5.moveleft();
			break;
		}
		case "random": {
			movement5.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[5]) {
		case "down": {
			movement6.movedown();
			break;
		}
		case "up": {
			movement6.moveup();
			break;
		}
		case "right": {
			movement6.moveright();
			break;
		}
		case "left": {
			movement6.moveleft();
			break;
		}
		case "random": {
			movement6.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[6]) {
		case "down": {
			movement7.movedown();
			break;
		}
		case "up": {
			movement7.moveup();
			break;
		}
		case "right": {
			movement7.moveright();
			break;
		}
		case "left": {
			movement7.moveleft();
			break;
		}
		case "random": {
			movement7.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[7]) {
		case "down": {
			movement8.movedown();
			break;
		}
		case "up": {
			movement8.moveup();
			break;
		}
		case "right": {
			movement8.moveright();
			break;
		}
		case "left": {
			movement8.moveleft();
			break;
		}
		case "random": {
			movement8.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[8]) {
		case "down": {
			movement9.movedown();
			break;
		}
		case "up": {
			movement9.moveup();
			break;
		}
		case "right": {
			movement9.moveright();
			break;
		}
		case "left": {
			movement9.moveleft();
			break;
		}
		case "random": {
			movement9.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
		switch (actarr[9]) {
		case "down": {
			movement10.movedown();
			break;
		}
		case "up": {
			movement10.moveup();
			break;
		}
		case "right": {
			movement10.moveright();
			break;
		}
		case "left": {
			movement10.moveleft();
			break;
		}
		case "random": {
			movement10.moverandom();
			break;
		}
		default: {
			x=x+0;
			y=y+0;
			break;
		 }
	}
	//	/--/
		if(flag1==1) {
		movement1.display1();
		}
		if(flag2==1) {
		movement2.display2();}
		if(flag3==1) {
		movement3.display3();}
		
		if(flag4==1) {
			movement4.display4();}
		if(flag5==1) {
			movement5.display5();}
		if(flag6==1) {
			movement6.display6();}
		if(flag7==1) {
			movement7.display7();}
		if(flag8==1) {
			movement8.display8();}
		if(flag9==1) {
			movement9.display9();}
		if(flag10==1) {
			movement10.display10();}
	}

	

class Movement {
	int x, y, m;

	Movement(int x, int y, int m) {
		Random r = new Random();
		//this.x=x;
		//this.y=y;
		this.y = r.nextInt(600-100)+100;
		this.x = r.nextInt(600-100)+100;
		this.m = m;
	}

	public void moveright() {
		if(x<600) {
			x = x + 1;}
			else {
				do{x=x-1;}while(x>100);
				}
	}

	public void moveleft() {
		if(x>0) {
			x = x - 1;}
			else  {
				x=600;
				
				}
	}

	public void moveup() {
		if(y>0) {
			y = y - 1;}
			else
			{
				y=600;
			}
	}

	public void movedown() {
		if(y<600) {
			y = y + 1;}
			else
			{
				do{y=y-1;}while(y>100);
			}
	}

	public void moverandom() {
		Random rand = new Random();
		x = x + (int)rand.nextGaussian();
		y = y + (int)rand.nextGaussian();
		if(x==600||x==0) {
			x=width-10;
		}
		if(y==600||y==0) {
			y=height-10;
		}
	}
	

public void display1() {
//	Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd1.create(x, y, objh, objh);
		}
public void display2() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd2.create(x, y,objh, objw);
		}
public void display3() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd3.create(x, y, objh, objw);
		}

public void display4() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd4.create(x, y, objh, objw);
		}
public void display5() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd5.create(x, y, objh, objw);
		}
public void display6() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd6.create(x, y, objh, objw);
		}
public void display7() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd7.create(x, y, objh, objw);
		}
public void display8() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd8.create(x, y, objh, objw);
		}
public void display9() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd9.create(x, y, objh, objw);
		}
public void display10() {
	//Random r = new Random();
	//x = r.nextInt(screen_width);
	//y=r.nextInt(screen_height);
	qd10.create(x, y, objh, objw);
		}

	}
}