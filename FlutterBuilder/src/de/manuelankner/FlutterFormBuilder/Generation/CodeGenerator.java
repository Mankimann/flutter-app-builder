package de.manuelankner.FlutterFormBuilder.Generation;



import java.io.InputStreamReader;

public class CodeGenerator implements Runnable {
	
	public InputStreamReader input = new InputStreamReader(System.in);

	
	
	public void readIn() {
		
		new Thread(this).start();
		
			
	}
	
	public void write() {
		new Thread(this).start();
		
	}

	@Override
	public void run() {
	
		readIn();
		write();	
	}

}