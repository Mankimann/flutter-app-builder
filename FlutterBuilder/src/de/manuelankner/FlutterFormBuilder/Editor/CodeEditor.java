package de.manuelankner.FlutterFormBuilder.Editor;
import de.manuelankner.FlutterFormBuilder.Window.Frame;
import de.manuelankner.FlutterFormBuilder.Window.Window;

public class CodeEditor {
	
	public static Window windowing = new Window();
	public Frame frame = new Frame(640, 480, "Launcher");
	boolean isRunning = false;
	
	public void create() {
		windowing.createWindow(frame);
		isRunning = true;
	}
	public void cleanUp() {
		windowing.FreeAllocate(0);
		isRunning = false;
	}
}
