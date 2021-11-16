package de.manuelankner.FlutterFormBuilder;

import javafx.scene.image.Image;

public class AppConfig {

	public static final String Name = "Flutter Builder ";
	public static final String _VERSION = " v.0.2";
	public static final int WIDTH = 1500;
	public static final int HEIGHT = 1000;
	public static final int TAB_SIZE_WIDTH = 710;
	public static final int TAB_SIZE_HEIGHT = 740;
	// Icon image
	public static String WIREFRAME_PATH = "/assets/images/wireframe.png";
	public static Image img = new Image(WIREFRAME_PATH);
	
	
	public static Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		AppConfig.img = img;
	} 
	
	
	

}
