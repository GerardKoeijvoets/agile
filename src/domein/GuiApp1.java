package domein;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiApp1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("receptMaker");
		Scene scene = new Scene(new Group(), 450, 250);
		ObservableList<String> base = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
		ComboBox comboBox = new ComboBox(base);
		ObservableList<String> greens = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
		ComboBox comboBox2 = new ComboBox(greens);
		ObservableList<String> meat = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
		ComboBox comboBox3 = new ComboBox(meat);
		GridPane grid = new GridPane();
		ListView<String> list = new ListView<String>();
		ObservableList<String> recepy = FXCollections.observableArrayList("Single", "Double", "Suite", "Family App");
		list.setItems(recepy);
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));
		grid.add(new Label("Base: "), 0, 0);
		grid.add(comboBox, 1, 0);
		grid.add(new Label("Greens: "), 0, 1);
		grid.add(comboBox2, 1, 1);
		grid.add(new Label("Meat: "), 0, 2);
		grid.add(comboBox3, 1, 2);
		grid.add(new Label("Recepies"), 0, 3);
		grid.add(list, 1, 3);
		Button button = new Button("calculate");
		grid.add(button, 2, 0);
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		Group root = (Group) scene.getRoot();
		root.getChildren().add(grid);
		stage.setScene(scene);
		stage.show();
	}
}
