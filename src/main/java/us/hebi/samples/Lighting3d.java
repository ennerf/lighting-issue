package us.hebi.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;


public class Lighting3d extends Application {

    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        System.out.println("Running JavaFX " + javaVersion + ", on Java " + javafxVersion);

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