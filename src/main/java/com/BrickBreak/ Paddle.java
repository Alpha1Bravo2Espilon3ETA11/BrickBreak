package com.BrickBreak;

import java.awt.Graphics;
import java.awt.Color;

public class Paddle {

	// Instance Variables
	private int x, y, width, height;
	private int velocity;

	// Constructor
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 0;
	}

	// Methods
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

	public void move() {
		x += velocity;
		// Keep paddle within screen boundaries (approximate based on BrickBreak borders)
		if (x < 10) x = 10;
		if (x > 582) x = 582;
	}

	public void addVelocity(int v) {
		this.velocity += v;
	}

	public void setVelocity(int v) {
		this.velocity = v;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
}
