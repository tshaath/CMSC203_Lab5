

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {

    /**
     * The main method for the GUI example program JavaFX version
     * @param args not used
     * @throws IOException
     */

    public FXMainPane root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        //student Task #1:
        //  instantiate the FXMainPane, name it root

        FXMainPane p = new FXMainPane();
        //  set the scene to hold root
        p.start(stage);
        //set stage title
        stage.setTitle("Hello World GUI");
        //display the stage
        stage.show();

    }
}
