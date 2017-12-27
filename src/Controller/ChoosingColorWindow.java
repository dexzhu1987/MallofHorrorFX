package Controller;


import Model.Playable.Playable;
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

public class ChoosingColorWindow {
    static String theColor;

    public static String display(List<Playable> opitons, String message){
        Stage window = new Stage();
        window.setTitle("Please select the color");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(30, 10, 30, 10));


        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\digital-7.ttf")), 25);
            label.setFont(f); // use this font with our label
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Button redButton = new Button("");
        redButton.setId("red");
        Button yellowButton = new Button("");
        yellowButton.setId("yellow");
        Button blueButton = new Button("");
        blueButton.setId("blue");
        Button greenButton = new Button("");
        greenButton.setId("green");
        Button brownButton = new Button("");
        brownButton.setId("brown");
        Button blackButton = new Button("");
        blackButton.setId("black");

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
                if (opitons.get(i).getColor().equalsIgnoreCase(oneToSix.get(q).getId())  ){
                    optionsButton.add(oneToSix.get(q));
                }
        }


//        VBox layout = new VBox(10);
//        layout.getChildren().clear();
//
//        layout.getChildren().add(label);
//
//        for (int i=0; i<optionsButton.size(); i++){
//            layout.getChildren().add(optionsButton.get(i));
//        }
//
//        layout.setAlignment(Pos.CENTER);
//        Scene scene = new Scene(layout);
//        window.setScene(scene);
//        window.showAndWait();


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 20, 10, 20));

        FlowPane colors = new FlowPane();
        colors.setPadding(new Insets(10, 20, 10, 20));
        colors.setHgap(60);
        colors.setVgap(30);
        colors.setAlignment(Pos.CENTER);


        for (int i=0; i<optionsButton.size(); i++){
            colors.getChildren().add(optionsButton.get(i));
        }

        layout.getChildren().clear();
        layout.getChildren().addAll(label, colors);


        layout.setAlignment(Pos.CENTER);
        layout.setId("numberwindowbg");
        Scene scene = new Scene(layout,400,300);
        File f = new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


        return theColor;
    }

}
