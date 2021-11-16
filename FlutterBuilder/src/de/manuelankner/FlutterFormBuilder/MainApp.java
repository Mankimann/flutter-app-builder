package de.manuelankner.FlutterFormBuilder;

import de.manuelankner.FlutterFormBuilder.Editor.CodeEditor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class MainApp extends Application{
	
	public static CodeEditor launcher;
	
	@Override
	public void start(Stage primaryStage) throws Exception  {
			Parent root = FXMLLoader.load(getClass().getResource("/assets/fxml/MainWindow.fxml"));
			Scene scene = new Scene(root, AppConfig.WIDTH, AppConfig.HEIGHT );
			//primaryStage.initStyle(StageStyle.UTILITY);
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(AppConfig.getImg());
			primaryStage.setTitle(AppConfig.Name + AppConfig._VERSION);
			primaryStage.setScene(scene);
			primaryStage.show();		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
