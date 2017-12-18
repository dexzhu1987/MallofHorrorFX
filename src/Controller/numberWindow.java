package Controller;

import java.util.ArrayList;
import java.util.List;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class NumberWindow {
    static int theNumber;

    public static int display(List<Integer> opitons, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Please select your number");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button numberOneButton = new Button("1");
        Button numberTwoButton = new Button("2");
        Button numberThreeButton = new Button("3");
        Button numberFourButton = new Button("4");
        Button numberFiveButton = new Button("5");
        Button numberSixButton = new Button("6");

        //Clicking will set answer and close window
        numberOneButton.setOnAction(e -> {
            theNumber = 1;
            window.close();
        });
        numberTwoButton.setOnAction(e -> {
            theNumber = 2;
            window.close();
        });
        numberThreeButton.setOnAction(e -> {
            theNumber = 3;
            window.close();
        });
        numberFourButton.setOnAction(e -> {
            theNumber = 4;
            window.close();
        });
        numberFiveButton.setOnAction(e -> {
            theNumber = 5;
            window.close();
        });
        numberSixButton.setOnAction(e -> {
            theNumber = 6;
            window.close();
        });


        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);
        oneToSix.add(numberSixButton);

        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        for (int i=0; i<opitons.size();i++){
            for (int q=0; q<oneToSix.size(); q++)
            if (opitons.get(i)==Integer.parseInt(oneToSix.get(q).getText()) ){
                optionsButton.add(oneToSix.get(q));
            }
        }



        VBox layout = new VBox(10);

        layout.getChildren().add(label);

        for (int i=0; i<optionsButton.size(); i++){
            layout.getChildren().add(optionsButton.get(i));
        }


        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return theNumber;
    }



    public static int getTheNumber() {
        return theNumber;
    }

}
