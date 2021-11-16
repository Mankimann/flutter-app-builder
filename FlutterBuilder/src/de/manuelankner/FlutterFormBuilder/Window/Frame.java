package de.manuelankner.FlutterFormBuilder.Window;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.JFrame;


public class Frame  extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private String TITLE = "";
	private int WIDTH = 640,  HEIGHT = 360;
	public JFrame close;
	public JFrame win;
	public TextArea area = new TextArea();
	
	public Frame(int width, int height, String title) {
		this.WIDTH = width;
		this.HEIGHT = height;
		this.TITLE = title;
		this.setTitle(TITLE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(width, height));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		area.setSize(getWIDTH() - 15, getHEIGHT() - 15);
		area.setBackground(Color.MAGENTA);
		this.setAlwaysOnTop(true);
		this.add(area);
		this.setVisible(true);
	}
	
	public int getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(int WIDTH) {
		this.WIDTH = WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(int HEIGHT) {
		this.HEIGHT = HEIGHT;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}
}
