package de.manuelankner.FlutterFormBuilder.Generation;

import java.io.File;
import java.io.IOException;

public class FileLoader {

	public FileLoader loadFile(File file,String path) {
		
		if(!file.exists())
			try {
				file.createNewFile();
				file.canWrite();
				file.canRead();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		path = file.getAbsolutePath();
		return new FileLoader();
	}
}
