package de.manuelankner.FlutterFormBuilder;

//import de.manuelankner.FlutterFormBuilder.Window.Window;
import de.manuelankner.FlutterFormBuilder.launcher.Launcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application{
	
	public static Launcher launcher;
	
	@Override
	public void start(Stage primaryStage) throws Exception  {
			Parent root = FXMLLoader.load(getClass().getResource("/assets/fxml/MainWindow.fxml"));
			Scene scene = new Scene(root, AppConfig.WIDTH, AppConfig.HEIGHT );
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(AppConfig.getImg());
			primaryStage.setTitle("Flutter Builder" + AppConfig._VERSION);
			primaryStage.show();		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
