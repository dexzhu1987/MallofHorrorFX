package Controller;


import Model.Playable.Playable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ChoosingColorWindow {
    static String theColor;

    public static String display(List<Playable> opitons, String message){
        Stage window = new Stage();
        window.setTitle("Please select the color");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button redButton = new Button("Red");
        Button yellowButton = new Button("Yellow");
        Button blueButton = new Button("Blue");
        Button greenButton = new Button("Green");
        Button brownButton = new Button("Brown");
        Button blackButton = new Button("Black");

        //Clicking will set answer and close window
        redButton.setOnAction(e -> {
            theColor = "Red";
            window.close();
        });
        yellowButton.setOnAction(e -> {
            theColor = "Yellow";
            window.close();
        });
        blueButton.setOnAction(e -> {
            theColor = "Blue";
            window.close();
        });
        greenButton.setOnAction(e -> {
            theColor = "Green";
            window.close();
        });
        brownButton.setOnAction(e -> {
            theColor = "Brown";
            window.close();
        });
        blackButton.setOnAction(e -> {
            theColor = "Black";
            window.close();
        });

        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(redButton);
        oneToSix.add(yellowButton);
        oneToSix.add(blueButton);
        oneToSix.add(greenButton);
        oneToSix.add(brownButton);
        oneToSix.add(blackButton);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        for (int i=0; i<opitons.size();i++){
            for (int q=0; q<oneToSix.size(); q++)
                if (opitons.get(i).getColor().equalsIgnoreCase(oneToSix.get(q).getText())  ){
                    optionsButton.add(oneToSix.get(q));
                }
        }


        VBox layout = new VBox(10);
        layout.getChildren().clear();

        layout.getChildren().add(label);

        for (int i=0; i<optionsButton.size(); i++){
            layout.getChildren().add(optionsButton.get(i));
        }

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return theColor;
    }

}
