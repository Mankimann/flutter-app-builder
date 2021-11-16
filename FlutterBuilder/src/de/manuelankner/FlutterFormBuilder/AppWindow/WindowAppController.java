package de.manuelankner.FlutterFormBuilder.AppWindow;


import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import de.manuelankner.FlutterFormBuilder.Generation.CodeGenerator;
import de.manuelankner.FlutterFormBuilder.ItemBuilder.ItemListController;
import de.manuelankner.FlutterFormBuilder.Window.Frame;
import de.manuelankner.FlutterFormBuilder.Wireframe.Drawer;
import de.manuelankner.FlutterFormBuilder.toolbox.ModelTab;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WindowAppController implements Initializable {

	public static final String path = "/assets/images/wireframe2.jpg";
	public static final Double TABLE_SIZE = 493.0D;
	@FXML
	public static Image wireframe = new Image(path);
	@FXML
	public static ImageView main_image = new ImageView();
	@FXML
	public static JFXTextField txtUsername, txtPassword;
	@FXML
	public static Button btn_open_editor = new Button();
	@FXML
	public Accordion acc_layouts = new Accordion();
	@FXML
	public TitledPane tp[] = new TitledPane[3];
	@FXML
	public MenuItem item_newModel = new MenuItem();
	@FXML
	public TextArea textArea = new TextArea();
	@FXML
	public TabPane modelTab = new TabPane();
	
	public Tab lastTab = new Tab();
	
	Drawer drawer = new Drawer();
	ItemListController itemController = new ItemListController();
	ModelTab model = new ModelTab();

	@FXML
	public void openEditor() {
	Frame f = new Frame(700, 1400, "Code Editor");
	f.setVisible(true);
	}
	
	@FXML
	public void close(ActionEvent e) {
		Platform.exit();
		System.exit(0);
	}
	
	@FXML
	public void newModel(ActionEvent e) {	
		modelTab.getTabs().addAll(model.addTab(1));
		//modelTab.getTabs().add(new Tab("New"));
		newWireframe();
	}
	
	@FXML
	public void TextView_CodeGen(ActionEvent e) {
		CodeGenerator generator = new CodeGenerator();
		// remove this code, adding the file loading and reading into the CodeGenerator and load it here
	}
	
	public void newWireframe() {
		double width =  wireframe.getWidth();
		double height = wireframe.getHeight();
		main_image.setImage(wireframe);
		main_image.setTranslateX(width);
		main_image.setTranslateY(height);
		main_image.setVisible(true);
//		main_image.scaleXProperty().add(x);
//		main_image.scaleYProperty().add(y);
//		main_image.sceneToLocal(x, y).add(50D, 50D);
		
		ModelTab.panel.getChildren().add(main_image);
	
		System.out.println("Debug - new Wireframe");
		System.out.println(ModelTab.panel.getChildren().add(main_image));
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
}
