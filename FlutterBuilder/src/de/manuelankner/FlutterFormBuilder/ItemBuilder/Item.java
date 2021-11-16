package de.manuelankner.FlutterFormBuilder.ItemBuilder;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class Item {
	public String name;
	public int id;
	// drag and drop
	public double orgSceneX, orgSceneY;
	public double orgTranslateX, orgTranslateY;

	public Item() {
	
	}
	
	public static EventHandler<MouseEvent> itemDragged = new EventHandler<MouseEvent>() {
		
		@Override
		public void handle(MouseEvent event) {
			System.out.println("test");
		}
	};
	
	public EventHandler<MouseEvent> itemPressed = new EventHandler<MouseEvent>() {
		
		@Override
		public void handle(MouseEvent event) {
			orgSceneX = event.getSceneX();
			orgSceneY = event.getSceneY();
			
			orgTranslateX = ((Rectangle) event.getSource()).getTranslateX();
			orgTranslateY = ((Rectangle) event.getSource()).getTranslateY();
			System.out.println(orgTranslateX + "\n ");
			System.out.println(orgTranslateY);
		}
	};
	
	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOrgSceneX() {
		return orgSceneX;
	}

	public void setOrgSceneX(double orgSceneX) {
		this.orgSceneX = orgSceneX;
	}

	public double getOrgSceneY() {
		return orgSceneY;
	}

	public void setOrgSceneY(double orgSceneY) {
		this.orgSceneY = orgSceneY;
	}

	public double getOrgTranslateX() {
		return orgTranslateX;
	}

	public void setOrgTranslateX(double orgTranslateX) {
		this.orgTranslateX = orgTranslateX;
	}

	public double getOrgTranslateY() {
		return orgTranslateY;
	}

	public void setOrgTranslateY(double orgTranslateY) {
		this.orgTranslateY = orgTranslateY;
	}
	
	
	
	
}

//image2 = new ItemForm(null, name, y, y);
//image2.setText(name);
//image2.setLayoutX(sizeT_X);
//image2.setLayoutY(sizeT_Y);