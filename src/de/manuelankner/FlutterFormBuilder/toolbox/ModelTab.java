package de.manuelankner.FlutterFormBuilder.toolbox;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;

public class ModelTab extends Tab {
	
	@FXML
	public TabPane modelTab = new TabPane();
	
	
	public ModelTab() {
//		Tab t = new Tab(text);
//		t.getTabPane().setTabMinWidth(712.0D);
//		t.getTabPane().setTabMinHeight(743.0D);
	}
	
	public void closeTabs(Tab lastTab) {
		modelTab.getTabClosingPolicy().compareTo(TabClosingPolicy.SELECTED_TAB);
			
		lastTab.setOnClosed(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {	
				if(lastTab.isSelected()) {
					lastTab.getTabPane().getTabs().remove(this);
				}
			}
		});
	}
	
	public Tab addTab(String id) {
		Tab t = new Tab();
		t.setId(id);
		t.setClosable(true);
		t.setText("New " + id);
		return t;
	}
	

	

}
