package de.manuelankner.FlutterFormBuilder.toolbox;


import javafx.scene.control.Button;

public class InputManager {
	
	public boolean isTrigger = false;
	
	public  void getButtonInput(Button b) {
		isTrigger = true;
		if(b.isPressed() || isTrigger == true) {
			//TODO 
			
		}
	}
}
