package us.hebi.samples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;


public class Lighting3d extends Application {

    public void start(Stage stage) {
        stage.setTitle(String.format("%s + Java %s + JavaFX %s",
                System.getProperty("os.name"),
                System.getProperty("java.version"),
                System.getProperty("javafx.version")
        ));

        var root = new Group();
        int n = 200;
        double margin = 10;
        double size = 100;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
//                var obj = new Box(size, size,  size);
                var obj = new Sphere(size / 2);
                obj.setTranslateX(row * (size + margin));
                obj.setTranslateY(col * (size + margin));
                root.getChildren().add(obj);
            }
        }

        Scene scene = new Scene(root, 1024, 1024, true, SceneAntialiasing.BALANCED);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}