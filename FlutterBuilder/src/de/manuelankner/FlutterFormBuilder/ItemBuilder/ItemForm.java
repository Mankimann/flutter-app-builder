package de.manuelankner.FlutterFormBuilder.ItemBuilder;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public  class ItemForm extends Rectangle {
	
	private float x, y;
	private final float with = 290, height = 30;
	private float[] positions;
	private Item item;
	
	public ItemForm() {
//		this.setFill(Color.LIGHTSLATEGREY);
//		this.setWidth(with);
//		this.setHeight(height);
//		this.setHover(true);
//		this.setMouseTransparent(isHover());
//		this.setOnMousePressed(new Item().itemPressed);

	}

	public ItemForm getForm(float width, float height) {
		return getForm(width, height);
	}
	
	public ItemForm getForm() {
		return (ItemForm) new Rectangle();
	}
	

	

}
