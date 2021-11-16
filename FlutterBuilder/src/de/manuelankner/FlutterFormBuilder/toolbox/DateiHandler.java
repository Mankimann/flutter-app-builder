package de.manuelankner.FlutterFormBuilder.toolbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class DateiHandler {
	
	File f = null;
	Scanner scanner = new Scanner(System.in);

	DateiHandler(File f) {
		
	}
	
	public void createFile(String path) throws IOException {
		File f = new File(path);
		if(!f.exists()) 
		{
			f.createNewFile();
		}
		else {
			System.out.println("File all ready exists");
		}
	}
	public void readIn(String path) {
		path = scanner.next();
		String inhalt = "";
		f = new File(path);
		Formatter x = null;
		if(f.exists()) {	
			try {
				Scanner l = new Scanner(f);
				while(l.hasNext()) {
					inhalt+=l.next();
				}
				x = new Formatter(f);
				x.format("%s", inhalt);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				x = new Formatter(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void output() {
		
	}
	
	public void cleanUp() {
		scanner.close();
		
	}
	
	public void readFlutterCode() {
		
	}
	
	public void createFlutterProject() {
	}
	
	public static void main(String[] args) {
		File f = new File("C://Users//mankn//Desktop//test.txt");
		DateiHandler dateiHandler = new DateiHandler(f);
		dateiHandler.readIn(f.getAbsolutePath());
	}


}
