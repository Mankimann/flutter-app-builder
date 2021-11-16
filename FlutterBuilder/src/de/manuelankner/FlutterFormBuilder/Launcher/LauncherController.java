package de.manuelankner.FlutterFormBuilder.Launcher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class LauncherController implements Initializable{

	@FXML
	private static Text  _db = new Text();
	private boolean isConnected = false;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		_db.setText(location.getPath().toString());
	
	}
}
