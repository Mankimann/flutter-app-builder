package de.manuelankner.FlutterFormBuilder;

import javafx.scene.image.Image;

public class AppConfig {

	// stats
	public static final String Name = "";
	public static final String _VERSION = " v.0.1";
	public static final int WIDTH = 1500;
	public static final int HEIGHT = 1000;
	
	// Icon image
	public static String PATH = "/assets/images/wireframe.png";
	public static Image img = new Image(PATH);
	
	
	public static Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		AppConfig.img = img;
	} 
	
	
	

}
