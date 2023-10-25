Minimum reproducible sample for a JavaFX 3D lighting issue occuring on macOS 14.0. See [issue #1](https://github.com/ennerf/lighting-issue/issues/1) for screenshots.

`mvn javafx:run`

from [src/main/java/us/hebi/samples/Lighting3d.java](src/main/java/us/hebi/samples/Lighting3d.java)

```Java
public class Lighting3d extends Application {

    public void start(Stage stage) {
        stage.setTitle(String.format("%s (%s) + Java %s + JavaFX %s",
                System.getProperty("os.name"),
                System.getProperty("os.version"),
                System.getProperty("java.version"),
                System.getProperty("javafx.version")
        ));

        var root = new Group();
        int n = 200;
        double margin = 10;
        double size = 100;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
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


```
