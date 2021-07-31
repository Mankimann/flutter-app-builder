package de.manuelankner.FlutterFormBuilder.launcher;

import de.manuelankner.FlutterFormBuilder.Window.Frame;
import de.manuelankner.FlutterFormBuilder.Window.Window;

public class Launcher {
	
	public static Window windowing = new Window();
	public Frame frame = new Frame(640, 480, "Launcher");
	boolean isRunning = false;
	
	public void create() {
		
		windowing.createWindow(frame);
		isRunning = true;
	}

	

}
