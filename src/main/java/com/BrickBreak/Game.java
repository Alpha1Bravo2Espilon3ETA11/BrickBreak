/*
 * Author: Diego Aldworth
 * Date: 1/09/26
 * Description: This is the driver program for the BrickBreak game featuring a classic arcade feel.
 */
package com.BrickBreak;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;

public class Game  {
	public static void main(String[] args) {
	    JFrame obj = new JFrame();
	    BrickBreak gamePlay = new BrickBreak(7,5, 20, 20);
	    obj.setBounds(10, 10, 700, 600);
	    obj.setTitle("Brick Break");
	    obj.setResizable(false);
	    obj.setVisible(true);
	    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    obj.add(gamePlay);
	    obj.addKeyListener(gamePlay);
	}
}
