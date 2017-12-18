package Controller;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SimpleMessageWindow {

    public static void display(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Please read the below message");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button ok = new Button("OK");


        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });







        VBox layout = new VBox(10);

        layout.getChildren().add(label);
        layout.getChildren().addAll(ok);

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();



    }
}
