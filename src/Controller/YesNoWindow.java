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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class YesNoWindow {
    static boolean answer;


    public static boolean display(String message){
        Stage window = new Stage();
        window.setTitle("Please select your answer");

        Label label = new Label();
        label.setText(message);
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(30, 10, 30, 10));



//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
            InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
            final Font f1 = Font.loadFont(is, 25);
            label.setFont(f1); // use this font with our label
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        Button yes = new Button("");
        yes.setId("yesbttn");
        Button no = new Button("");
        no.setId("nobttn");

        //Clicking will set answer and close window
        yes.setOnAction(e -> {
            answer = true;
            window.close();
        });
        no.setOnAction(e -> {
            answer = false;
            window.close();
        });


//        VBox layout = new VBox(10);
//
//        layout.getChildren().add(label);
//        layout.getChildren().addAll(yes,no);
//
//
//        layout.setAlignment(Pos.CENTER);
//        Scene scene = new Scene(layout);
//        window.setScene(scene);
//        window.showAndWait();


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 20, 10, 20));

        FlowPane answers = new FlowPane();
        answers.setPadding(new Insets(10, 20, 10, 20));
        answers.setHgap(100);
        answers.setVgap(40);
        answers.setAlignment(Pos.CENTER);


        answers.getChildren().addAll(yes,no);

        layout.getChildren().clear();
        layout.getChildren().addAll(label, answers);


        layout.setAlignment(Pos.CENTER);
        layout.setId("numberwindowbg");
        Scene scene = new Scene(layout,400,300);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


        return answer;
    }

}
