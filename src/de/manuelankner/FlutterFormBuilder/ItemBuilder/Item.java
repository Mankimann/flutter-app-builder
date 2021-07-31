package de.manuelankner.FlutterFormBuilder.ItemBuilder;

import com.jfoenix.controls.JFXButton;


public class Item {
	
	public String name;
	public int sizeT_Y, sizeT_X;
	public JFXButton btn;

	public Item(JFXButton btn, String name, int x, int y) {
		this.name = name;
		this.sizeT_X = x;
		this.sizeT_Y = y;
		
		btn = new JFXButton();
		btn.setText(name);
		btn.setLayoutX(sizeT_X);
		btn.setLayoutY(sizeT_Y);
	
	}
	
	public JFXButton getPane() {
		return btn;
	}

	public void setPane(JFXButton pane) {
		this.btn = pane;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSizeT_Y() {
		return sizeT_Y;
	}

	public void setSizeT_Y(int sizeT_Y) {
		this.sizeT_Y = sizeT_Y;
	}

	public int getSizeT_X() {
		return sizeT_X;
	}

	public void setSizeT_X(int sizeT_X) {
		this.sizeT_X = sizeT_X;
	}
	

}
