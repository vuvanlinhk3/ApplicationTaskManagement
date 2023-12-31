package MyCard;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MyCardApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyCardApplication.class.getResource("MyCardForm.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,1300,600 );
        primaryStage.setTitle("Các thẻ của tôi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
