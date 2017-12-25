package Controller;

import Model.Character.GameCharacter;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(20, 10, 20, 10));



        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\digital-7.ttf")), 20);
            label.setFont(f); // use this font with our label
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Button numberOneButton = new Button("Gun Man");
        numberOneButton.setId("gunMan");
        Button numberTwoButton = new Button("Tough Guy");
        numberTwoButton.setId("toughGuy");
        Button numberThreeButton = new Button("Model");
        numberThreeButton.setId("model");

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
        layout.setPadding(new Insets(10, 20, 10, 20));

        FlowPane numbers = new FlowPane();
        numbers.setPadding(new Insets(10, 10, 10, 10));
        numbers.setHgap(10);
        numbers.setVgap(30);
        numbers.setAlignment(Pos.CENTER);

        for (int i=0; i<optionsButton.size(); i++){
            numbers.getChildren().add(optionsButton.get(i));
        }


        layout.getChildren().clear();
        layout.getChildren().addAll(label, numbers);

        layout.setAlignment(Pos.CENTER);
        layout.setId("characterwindowbg");
        Scene scene = new Scene(layout,600,400);
        File f = new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


        return theCharacter;
    }




}


