package de.manuelankner.FlutterFormBuilder.toolbox;

import de.manuelankner.FlutterFormBuilder.AppConfig;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ModelTab  {
	public static AnchorPane panel = new AnchorPane();
	
	@FXML
	public Tab modelTab = new Tab();
	
	public Tab addTab(int i) {
		Tab t = new Tab();
		t.setClosable(true);
		t.setText("New " + Counter.getID());

		panel.setPrefSize(AppConfig.TAB_SIZE_WIDTH, AppConfig.TAB_SIZE_HEIGHT);
		ImageView imageView = new ImageView(AppConfig.getImg());
		panel.getChildren().add(imageView);
	
		return t;
	}

	public Tab getModelTab() {
		return modelTab;
	}

	public void setModelTab(Tab modelTab) {
		this.modelTab = modelTab;
	}

}
