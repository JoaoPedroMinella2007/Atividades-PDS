package principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Somar Números");
        stage.setScene(scene);
        stage.show();

    }

}
