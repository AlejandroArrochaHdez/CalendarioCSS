package dad.calendario.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	CalendarioCssController c;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		c = new CalendarioCssController();
		
		Scene scene = new Scene(c.getView());
		primaryStage.setTitle("Calendario");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
