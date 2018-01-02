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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ChoosingRoomWindow {
    static int theNumber;

    public static int display(List<Integer> opitons, String message) {
        Stage window = new Stage();
        window.setTitle("Please select your number");
        window.setMinWidth(250);
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

        Button numberZeroButton = new Button("0");
        numberZeroButton.setId("0");
        Button numberOneButton = new Button("1");
        numberOneButton.setId("restroomBttn");
        Button numberTwoButton = new Button("2");
        numberTwoButton.setId("cachouBttn");
        Button numberThreeButton = new Button("3");
        numberThreeButton.setId("megatoyBttn");
        Button numberFourButton = new Button("4");
        numberFourButton.setId("parkBttn");
        Button numberFiveButton = new Button("5");
        numberFiveButton.setId("securityHQBttn");
        Button numberSixButton = new Button("6");
        numberSixButton.setId("superstoreBttn");

        Button numberZeroButton2 = new Button("0");
        numberZeroButton2.setId("0");
        Button numberOneButton2 = new Button("1");
        numberOneButton2.setId("restroomBttn");
        Button numberTwoButton2 = new Button("2");
        numberTwoButton2.setId("cachouBttn");
        Button numberThreeButton2 = new Button("3");
        numberThreeButton2.setId("megatoyBttn");
        Button numberFourButton2 = new Button("4");
        numberFourButton2.setId("parkBttn");
        Button numberFiveButton2 = new Button("5");
        numberFiveButton2.setId("securityHQBttn");
        Button numberSixButton2 = new Button("6");
        numberSixButton2.setId("superstoreBttn");

        //Clicking will set answer and close window
        numberZeroButton.setOnAction(e -> {
            theNumber = 0;
            window.close();
        });
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

        numberZeroButton2.setOnAction(e -> {
            theNumber = 1;
            window.close();
        });
        numberOneButton2.setOnAction(e -> {
            theNumber = 1;
            window.close();
        });
        numberTwoButton2.setOnAction(e -> {
            theNumber = 2;
            window.close();
        });
        numberThreeButton2.setOnAction(e -> {
            theNumber = 3;
            window.close();
        });
        numberFourButton2.setOnAction(e -> {
            theNumber = 4;
            window.close();
        });
        numberFiveButton2.setOnAction(e -> {
            theNumber = 5;
            window.close();
        });
        numberSixButton2.setOnAction(e -> {
            theNumber = 6;
            window.close();
        });

        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberZeroButton);
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);
        oneToSix.add(numberSixButton);

        List<Button> oneToSix2 = new ArrayList<>();
        oneToSix2.add(numberZeroButton2);
        oneToSix2.add(numberOneButton2);
        oneToSix2.add(numberTwoButton2);
        oneToSix2.add(numberThreeButton2);
        oneToSix2.add(numberFourButton2);
        oneToSix2.add(numberFiveButton2);
        oneToSix2.add(numberSixButton2);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
        if (opitons.size()==2){
            for (int i=0; i<oneToSix.size(); i++){
                if (opitons.get(0)==Integer.parseInt(oneToSix.get(i).getText()) ){
                    optionsButton.add(oneToSix.get(i));
                }
            }
            for (int i=0; i<oneToSix.size(); i++){
                if (opitons.get(1)==Integer.parseInt(oneToSix2.get(i).getText()) ){
                    optionsButton.add(oneToSix2.get(i));
                }
            }
        }
        else {
            for (int i=0; i<opitons.size();i++){
                for (int q=0; q<oneToSix.size(); q++)
                    if (opitons.get(i)==Integer.parseInt(oneToSix.get(q).getText()) ){
                        optionsButton.add(oneToSix.get(q));
                    }
            }
        }



        VBox layout = new VBox(10);
        if (opitons.size()==2){
            layout.setSpacing(70);
        }
        layout.setPadding(new Insets(10, 20, 10, 20));

        FlowPane numbers = new FlowPane();
        numbers.setPadding(new Insets(10, 5, 10, 5));
        if (opitons.size()==2){
            numbers.setHgap(60);
        }else {
            numbers.setHgap(10);
        }
        numbers.setVgap(10);
        numbers.setAlignment(Pos.CENTER);


        for (int i=0; i<optionsButton.size(); i++){
            numbers.getChildren().add(optionsButton.get(i));
        }

        layout.getChildren().clear();
        layout.getChildren().addAll(label, numbers);


        layout.setAlignment(Pos.CENTER);
        layout.setId("choosingRoomBg");
        Scene scene = new Scene(layout,700,525);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


        return theNumber;
    }



}
