//
// Author: Diego Aldworth
// Date: 1/09/26
// Description: This is the maain driver for the ball feature of the 
//
package com.BrickBreak;

import java.awt.Graphics;
import java.awt.Color;

public class Ball {

	private int xpos, ypos, size;
	private int xVelocity, yVelocity;

	// Precondition: size is a positive integer; x and y are within panel bounds.
	// Postcondition: Ball object is created with a default starting velocity.
	public Ball(int x, int y, int size) {
		this.xpos = x;
		this.ypos = y;
		this.size = size;
		this.xVelocity = 1;
		this.yVelocity = -2;
	}

	// Precondition: Graphics g is not null.
	// Postcondition: Draws a yellow circle representing the ball at current xpos and ypos.
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(xpos, ypos, size, size);
	}

	// Precondition: Game state is set to 'play'.
	// Postcondition: Adjusts xpos and ypos based on current velocity values.
	public void move() {
		xpos += xVelocity;
		ypos += yVelocity;
	}

	// Precondition: Ball has collided with a vertical surface (wall or brick side).
	// Postcondition: The horizontal direction of the ball is inverted.
	public void reverseX() {
		xVelocity = -xVelocity;
	}

	// Precondition: Ball has collided with a horizontal surface (paddle, ceiling, or brick top/bottom).
	// Postcondition: The vertical direction of the ball is inverted.
	public void reverseY() {
		yVelocity = -yVelocity;
	}

	// Precondition: xv and yv are integers.
	// Postcondition: The respective velocity component is updated to the new value.
	public void setXVelocity(int xv) { this.xVelocity = xv; }
	public void setYVelocity(int yv) { this.yVelocity = yv; }

	// Getters and Setters
	public int getXpos() { return xpos; }
	public int getYpos() { return ypos; }
	public int getSize() { return size; }
	public void setX(int x) { this.xpos = x; }
	public void setY(int y) { this.ypos = y; }
}
