package com.BrickBreak;

import java.awt.Graphics;
import java.awt.Color;

public class Paddle {

	private int x, y, width, height;
	private int velocity;

	// Precondition: Coordinates and dimensions should be positive integers.
	// Postcondition: A paddle object is initialized with position, size, and 0 velocity.
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 0;
	}

	// Precondition: Graphics g is not null.
	// Postcondition: Draws a green rectangle representing the paddle on the screen.
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

	// Precondition: Velocity has been set by user input.
	// Postcondition: Updates the x-coordinate of the paddle and ensures it stays within screen bounds.
	public void move() {
		x += velocity;
		if (x < 10) x = 10;
		if (x > 582) x = 582;
	}

	// Precondition: v is an integer representing change in speed.
	// Postcondition: Increases or decreases the current velocity by v.
	public void addVelocity(int v) {
		this.velocity += v;
	}

	// Precondition: v is a valid integer.
	// Postcondition: The paddle's velocity is set exactly to v.
	public void setVelocity(int v) {
		this.velocity = v;
	}

	// Getters and Setters
	public int getVelocity() { return velocity; }
	public int getX() { return x; }
	public void setX(int x) { this.x = x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
}
