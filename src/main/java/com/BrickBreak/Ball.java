package com.BrickBreak;

import java.awt.Graphics;
import java.awt.Color;

public class Ball {

	// Instance Variables
	private int xpos, ypos, size;
	private int xVelocity, yVelocity;

	// Constructor
	public Ball(int x, int y, int size) {
		this.xpos = x;
		this.ypos = y;
		this.size = size;
		// Initial speeds based on BrickBreak's restart logic
		this.xVelocity = 1;
		this.yVelocity = -2;
	}

	// Methods
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(xpos, ypos, size, size);
	}

	public void move() {
		xpos += xVelocity;
		ypos += yVelocity;
	}

	public void reverseX() {
		xVelocity = -xVelocity;
	}

	public void reverseY() {
		yVelocity = -yVelocity;
	}

	// Getters and Setters required by BrickBreak.java
	public int getXpos() { return xpos; }
	public int getYpos() { return ypos; }
	public int getSize() { return size; }

	public void setX(int x) { this.xpos = x; }
	public void setY(int y) { this.ypos = y; }

	public void setXVelocity(int xv) { this.xVelocity = xv; }
	public void setYVelocity(int yv) { this.yVelocity = yv; }
}
