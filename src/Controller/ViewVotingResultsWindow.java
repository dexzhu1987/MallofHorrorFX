package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ViewVotingResultsWindow {
    public static void display(List<Integer> opitons) {
        Stage window = new Stage();
        window.setTitle("Voting Results are..");
        window.setMinWidth(250);


//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
        InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
        final Font f1 = Font.loadFont(is, 23);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Button numberZeroButton = new Button("");
        numberZeroButton.setId("red");
        Button numberOneButton = new Button("");
        numberOneButton.setId("yellow");
        Button numberTwoButton = new Button("");
        numberTwoButton.setId("blue");
        Button numberThreeButton = new Button("");
        numberThreeButton.setId("green");
        Button numberFourButton = new Button("");
        numberFourButton.setId("brown");
        Button numberFiveButton = new Button("");
        numberFiveButton.setId("black");


        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberZeroButton);
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        for (int i=0; i<oneToSix.size(); i++){
            if (opitons.get(0)==Integer.parseInt(oneToSix.get(i).getText()) ){
                optionsButton.add(oneToSix.get(i));
            }
        }

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 20, 10, 20));

        FlowPane numbers = new FlowPane();
        numbers.setPadding(new Insets(10, 5, 10, 5));
        numbers.setHgap(15);
        numbers.setVgap(15);
        numbers.setAlignment(Pos.CENTER);

        for (int i=0; i<optionsButton.size(); i++){
            numbers.getChildren().add(optionsButton.get(i));
        }

        Button ok = new Button("");
        ok.setId("msgokbttn");

        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });

        layout.getChildren().clear();
        layout.getChildren().addAll(numbers, ok);


        layout.setAlignment(Pos.CENTER);
        layout.setId("ViewZombiesWindow");
        Scene scene = new Scene(layout,600,450);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();

}
