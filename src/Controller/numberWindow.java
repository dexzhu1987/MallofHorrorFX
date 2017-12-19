package Controller;

import java.util.ArrayList;
import java.util.List;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class numberWindow {
    static int theNumber;

    public static int display(List<Integer> opitons, String message){
        Stage window = new Stage();
        window.setTitle("Please select your number");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button numberZeroButton = new Button("0");
        Button numberOneButton = new Button("1");
        Button numberTwoButton = new Button("2");
        Button numberThreeButton = new Button("3");
        Button numberFourButton = new Button("4");
        Button numberFiveButton = new Button("5");
        Button numberSixButton = new Button("6");

        Button numberZeroButton2 = new Button("0");
        Button numberOneButton2 = new Button("1");
        Button numberTwoButton2 = new Button("2");
        Button numberThreeButton2 = new Button("3");
        Button numberFourButton2 = new Button("4");
        Button numberFiveButton2 = new Button("5");
        Button numberSixButton2 = new Button("6");

//        Button numberOneButton3 = new Button("1");
//        Button numberTwoButton3 = new Button("2");
//        Button numberThreeButton3 = new Button("3");
//        Button numberFourButton3 = new Button("4");
//        Button numberFiveButton3 = new Button("5");
//        Button numberSixButton3 = new Button("6");
//
//        Button numberOneButton4 = new Button("1");
//        Button numberTwoButton4 = new Button("2");
//        Button numberThreeButton4 = new Button("3");
//        Button numberFourButton4 = new Button("4");
//        Button numberFiveButton4 = new Button("5");
//        Button numberSixButton4 = new Button("6");
//
//        Button numberOneButton5 = new Button("1");
//        Button numberTwoButton5 = new Button("2");
//        Button numberThreeButton5 = new Button("3");
//        Button numberFourButton5 = new Button("4");
//        Button numberFiveButton5 = new Button("5");
//        Button numberSixButton5 = new Button("6");
//
//        Button numberOneButton6 = new Button("1");
//        Button numberTwoButton6 = new Button("2");
//        Button numberThreeButton6 = new Button("3");
//        Button numberFourButton6 = new Button("4");
//        Button numberFiveButton6 = new Button("5");
//        Button numberSixButton6 = new Button("6");

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

//        numberOneButton3.setOnAction(e -> {
//            theNumber = 1;
//            window.close();
//        });
//        numberTwoButton3.setOnAction(e -> {
//            theNumber = 2;
//            window.close();
//        });
//        numberThreeButton3.setOnAction(e -> {
//            theNumber = 3;
//            window.close();
//        });
//        numberFourButton3.setOnAction(e -> {
//            theNumber = 4;
//            window.close();
//        });
//        numberFiveButton3.setOnAction(e -> {
//            theNumber = 5;
//            window.close();
//        });
//        numberSixButton3.setOnAction(e -> {
//            theNumber = 6;
//            window.close();
//        });
//
//        numberOneButton4.setOnAction(e -> {
//            theNumber = 1;
//            window.close();
//        });
//        numberTwoButton4.setOnAction(e -> {
//            theNumber = 2;
//            window.close();
//        });
//        numberThreeButton4.setOnAction(e -> {
//            theNumber = 3;
//            window.close();
//        });
//        numberFourButton4.setOnAction(e -> {
//            theNumber = 4;
//            window.close();
//        });
//        numberFiveButton4.setOnAction(e -> {
//            theNumber = 5;
//            window.close();
//        });
//        numberSixButton4.setOnAction(e -> {
//            theNumber = 6;
//            window.close();
//        });
//
//        numberOneButton5.setOnAction(e -> {
//            theNumber = 1;
//            window.close();
//        });
//        numberTwoButton5.setOnAction(e -> {
//            theNumber = 2;
//            window.close();
//        });
//        numberThreeButton5.setOnAction(e -> {
//            theNumber = 3;
//            window.close();
//        });
//        numberFourButton5.setOnAction(e -> {
//            theNumber = 4;
//            window.close();
//        });
//        numberFiveButton5.setOnAction(e -> {
//            theNumber = 5;
//            window.close();
//        });
//        numberSixButton5.setOnAction(e -> {
//            theNumber = 6;
//            window.close();
//        });
//
//        numberOneButton6.setOnAction(e -> {
//            theNumber = 1;
//            window.close();
//        });
//        numberTwoButton6.setOnAction(e -> {
//            theNumber = 2;
//            window.close();
//        });
//        numberThreeButton6.setOnAction(e -> {
//            theNumber = 3;
//            window.close();
//        });
//        numberFourButton6.setOnAction(e -> {
//            theNumber = 4;
//            window.close();
//        });
//        numberFiveButton6.setOnAction(e -> {
//            theNumber = 5;
//            window.close();
//        });
//        numberSixButton6.setOnAction(e -> {
//            theNumber = 6;
//            window.close();
//        });

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

//        List<Button> oneToSix3 = new ArrayList<>();
//        oneToSix3.add(numberOneButton3);
//        oneToSix3.add(numberTwoButton3);
//        oneToSix3.add(numberThreeButton3);
//        oneToSix3.add(numberFourButton3);
//        oneToSix3.add(numberFiveButton3);
//        oneToSix3.add(numberSixButton3);
//
//        List<Button> oneToSix4 = new ArrayList<>();
//        oneToSix4.add(numberOneButton4);
//        oneToSix4.add(numberTwoButton4);
//        oneToSix4.add(numberThreeButton4);
//        oneToSix4.add(numberFourButton4);
//        oneToSix4.add(numberFiveButton4);
//        oneToSix4.add(numberSixButton4);
//
//        List<Button> oneToSix5 = new ArrayList<>();
//        oneToSix5.add(numberOneButton5);
//        oneToSix5.add(numberTwoButton5);
//        oneToSix5.add(numberThreeButton5);
//        oneToSix5.add(numberFourButton5);
//        oneToSix5.add(numberFiveButton5);
//        oneToSix5.add(numberSixButton5);
//
//        List<Button> oneToSix6 = new ArrayList<>();
//        oneToSix6.add(numberOneButton6);
//        oneToSix6.add(numberTwoButton6);
//        oneToSix6.add(numberThreeButton6);
//        oneToSix6.add(numberFourButton6);
//        oneToSix6.add(numberFiveButton6);
//        oneToSix6.add(numberSixButton6);
//
//
//        List<List> allofButtons = new ArrayList<>();
//        allofButtons.add(oneToSix);
//        allofButtons.add(oneToSix2);
//        allofButtons.add(oneToSix3);
//        allofButtons.add(oneToSix4);
//        allofButtons.add(oneToSix5);
//        allofButtons.add(oneToSix6);




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
        layout.getChildren().clear();
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




}
