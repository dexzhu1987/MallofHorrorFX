package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ViewVotingResultsWindow {
    public static void display(List<String> colors, HashMap<String, Integer> results) {
        Stage window = new Stage();
        window.setTitle("Voting Results are..");
        window.setMinWidth(250);


        AnchorPane layout = new AnchorPane();

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
        AnchorPane.setTopAnchor(numberZeroButton, );
        AnchorPane.setLeftAnchor(numberZeroButton,);
        Button numberOneButton = new Button("");
        AnchorPane.setTopAnchor(numberOneButton,);
        AnchorPane.setLeftAnchor(numberOneButton,);
        numberOneButton.setId("yellow");
        Button numberTwoButton = new Button("");
        numberTwoButton.setId("blue");
        AnchorPane.setTopAnchor(numberTwoButton,);
        AnchorPane.setLeftAnchor(numberTwoButton,);
        Button numberThreeButton = new Button("");
        numberThreeButton.setId("green");
        AnchorPane.setTopAnchor(numberThreeButton,);
        AnchorPane.setLeftAnchor(numberThreeButton,);
        Button numberFourButton = new Button("");
        numberFourButton.setId("brown");
        AnchorPane.setTopAnchor(numberFourButton,);
        AnchorPane.setLeftAnchor(numberFourButton,);
        Button numberFiveButton = new Button("");
        numberFiveButton.setId("black");
        AnchorPane.setTopAnchor(numberFiveButton,);
        AnchorPane.setLeftAnchor(numberFiveButton,);


        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberZeroButton);
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        for (int i = 0; i < colors.size(); i+=2) {
            for (int q=0; q<oneToSix.size(); q++){
                if (colors.get(i).equalsIgnoreCase(oneToSix.get(q).getId())) {
                    oneToSix.get(q).setId(colors.get(i+1)+"act");
                }
            }
        }




        Button ok = new Button("");
        ok.setId("msgokbttn");
        AnchorPane.setLeftAnchor(ok,262.5);
        AnchorPane.setBottomAnchor(ok,20.0);

        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });


        layout.getChildren().addAll(ok);


        layout.setId("ViewZombiesWindow");
        Scene scene = new Scene(layout, 600, 450);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
        ;
        window.setScene(scene);
        window.showAndWait();

    }
}