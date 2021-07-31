package de.manuelankner.FlutterFormBuilder.Generation;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeGenerator implements Runnable {
	
	public InputStreamReader input = new InputStreamReader(System.in);

	public void loadFile(String path) throws IOException {
		File f = new File(path);
		if(!f.exists()) 
		{
			System.out.println("File not found");
			f.createNewFile();
		}
	}
	
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