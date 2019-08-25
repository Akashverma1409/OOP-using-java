package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {
	PImage img;
	public void setup() {
		size(400,400);
		background(255);
		stroke(0);
		img=loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg","jpg");
		img.resize(0, height);
		image(img,0,0);
	}
	public void draw() {
		int [] color= sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(50, 50, 60, 60);
		
	}
	public int[] sunColorSec(float seconds) {
		int rgb[]=new int[3];
		float dif=Math.abs(30-seconds);
		float ratio=dif/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		return rgb;
	}

}
