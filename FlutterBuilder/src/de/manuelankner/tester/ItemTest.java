package de.manuelankner.tester;

import com.sun.javafx.geom.Shape;

import de.manuelankner.FlutterFormBuilder.ItemBuilder.Item;
import de.manuelankner.FlutterFormBuilder.ItemBuilder.ItemForm;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ItemTest extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600);
		
		// new Item
		ItemForm form = new ItemForm();
		form.setX(30);
		form.setY(30);
		form.setWidth(60);
		form.setHeight(60);
		form.setFill(Color.LIGHTSLATEGRAY);
		form.setOnMousePressed(new Item().itemPressed);
		root.getChildren().add(form);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
