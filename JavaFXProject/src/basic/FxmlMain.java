package basic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("AnchorRoot.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("root875.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML 화면");
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
