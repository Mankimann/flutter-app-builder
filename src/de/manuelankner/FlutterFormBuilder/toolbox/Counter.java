package de.manuelankner.FlutterFormBuilder.toolbox;

public class Counter {
	
	
	

public static String getID;
private int i, loops;


public int getCounterLoop(int loops) {
	
	for(int i = 0; i < loops; i++) {
		this.i = i;
		this.loops = loops;
	}
	return this.i;
	
}

}
