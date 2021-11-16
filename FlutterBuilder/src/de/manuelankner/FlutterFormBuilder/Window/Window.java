package de.manuelankner.FlutterFormBuilder.Window;

import javafx.application.Platform;

public class Window {

	public void createWindow(int width, int height, String title, boolean resizable, int ...hints) {
	}
	public void createWindow(Frame frame) {
	}
	public void FreeAllocate(int id) {
		if(!Platform.isFxApplicationThread()) {
			Platform.exit();
			System.exit(id);
		}	
	}
}
