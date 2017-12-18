package Controller;

import Model.Character.GameCharacter;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class YesNoWindow {
    static boolean answer;


    public static boolean display( String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Please select your answer");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button yes = new Button("Yes");
        Button no = new Button("No");

        //Clicking will set answer and close window
        yes.setOnAction(e -> {
            answer = true;
            window.close();
        });
        no.setOnAction(e -> {
            answer = false;
            window.close();
        });






        VBox layout = new VBox(10);

        layout.getChildren().add(label);
        layout.getChildren().addAll(yes,no);



        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return answer;
    }

}
