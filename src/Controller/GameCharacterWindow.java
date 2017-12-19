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

public class GameCharacterWindow {
    static String theCharacter;

    public static String display(List<GameCharacter> opitons, String message){
        Stage window = new Stage();
        window.setTitle("Please select your character");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button numberOneButton = new Button("Gun Man");
        Button numberTwoButton = new Button("Tough Guy");
        Button numberThreeButton = new Button("Model");

        //Clicking will set answer and close window
        numberOneButton.setOnAction(e -> {
            theCharacter = "Gun Man";
            window.close();
        });
        numberTwoButton.setOnAction(e -> {
            theCharacter = "Tough Guy";
            window.close();
        });
        numberThreeButton.setOnAction(e -> {
            theCharacter = "Model";
            window.close();
        });


        List<Button> oneToThree = new ArrayList<>();
        oneToThree.add(numberOneButton);
        oneToThree.add(numberTwoButton);
        oneToThree.add(numberThreeButton);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        for (int i=0; i<opitons.size();i++){
            for (int q=0; q<oneToThree.size(); q++)
                if (opitons.get(i).getName().equalsIgnoreCase(oneToThree.get(q).getText())  ){
                    optionsButton.add(oneToThree.get(q));
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


        return theCharacter;
    }




}


