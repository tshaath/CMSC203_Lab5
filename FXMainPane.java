package sample;




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.
 * Before beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

    //student Task #2:
    //  declare five buttons, a label, and a textfield
    //  declare two HBoxes

    //student Task #4:
    //  declare an instance of DataManager
    /**
     * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
     * wait to add a component to its containing component until the container has
     * been created.  This is the only constraint on the order in which the following
     * statements appear.
     */
    FXMainPane() {
        //student Task #2:
        //  instantiate the buttons, label, and textfield
        //  instantiate the HBoxes
        public void start(Stage stage)
        {

            DataManager object = new DataManager();

            HBox hb1 = new HBox();
            HBox hb2 = new HBox();
            TextField text = new TextField();

            Label label = new Label("FeedBack");
            Button button1 = new Button("Hello");
            button1.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {
                    text.setText(object.getHello());
                }
            });
            Button button2 = new Button("Howdy");
            button2.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {
                    text.setText(object.getHowdy());
                }
            });

            Button button3 = new Button("Chinese");
            button3.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {
                    text.setText(object.getChinese());
                }
            });

            Button button4 = new Button("Clear");
            button4.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {
                    text.setText(" ");
                }
            });
            Button button5 = new Button("Exit");
            button5.setOnAction(new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent e)
                {
                    System.exit(0);
                }
            });
            VBox vb = new VBox(50);

            vb.setAlignment(Pos.CENTER);

            Insets insert = new Insets(20, 20, 20, 20);

            vb.setSpacing(10);

            VBox.setMargin(text, new Insets(20, 20, 20, 20));
            VBox.setMargin(button1, new Insets(20, 20, 20, 20));
            VBox.setMargin(button2, new Insets(20, 20, 20, 20));
            VBox.setMargin(button3, new Insets(20, 20, 20, 20));
            VBox.setMargin(button4, new Insets(20, 20, 20, 20));
            VBox.setMargin(button5, new Insets(20, 20, 20, 20));

            hb1.setAlignment(Pos.CENTER);
            hb1.getChildren().addAll(lb,text,hb2);

            ObservableList<Node> list = vb.getChildren();

            list.addAll(text,button1,button2,button3,button4,button5,hb1);

            Scene scene = new Scene(vb);

            stage.setScene(scene);
            stage.show();

        //student Task #4:
        //  instantiate the DataManager instance
        //  set margins and set alignment of the components

        //student Task #3:
        //  add the label and textfield to one of the HBoxes
        //  add the buttons to the other HBox
        //  add the HBoxes to this FXMainPanel (a VBox)


    }

    //Task #4:
    //  create a private inner class to handle the button clicks
}