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

public class ViewZombiesWindow {

    public static void display(List<Integer> opitons) {
        Stage window = new Stage();
        window.setTitle("Zombies are approaching..");
        window.setMinWidth(250);
        Label label = new Label();
        label.setText("Four zombies have appeared and are approaching...");
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(20, 10, 20, 10));

//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
        InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
        final Font f1 = Font.loadFont(is, 23);
        label.setFont(f1); // use this font with our label
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

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

        Button numberOneButton3 = new Button("1");
        numberOneButton3.setId("restroomBttn");
        Button numberTwoButton3 = new Button("2");
        numberTwoButton3.setId("cachouBttn");
        Button numberThreeButton3 = new Button("3");
        numberThreeButton3.setId("megatoyBttn");
        Button numberFourButton3 = new Button("4");
        numberFourButton3.setId("parkBttn");
        Button numberFiveButton3 = new Button("5");
        numberFiveButton3.setId("securityHQBttn");
        Button numberSixButton3 = new Button("6");
        numberSixButton3.setId("superstoreBttn");

        Button numberOneButton4 = new Button("1");
        numberOneButton4.setId("restroomBttn");
        Button numberTwoButton4 = new Button("2");
        numberTwoButton4.setId("cachouBttn");
        Button numberThreeButton4 = new Button("3");
        numberThreeButton4.setId("megatoyBttn");
        Button numberFourButton4 = new Button("4");
        numberFourButton4.setId("parkBttn");
        Button numberFiveButton4 = new Button("5");
        numberFiveButton4.setId("securityHQBttn");
        Button numberSixButton4 = new Button("6");
        numberSixButton4.setId("superstoreBttn");


        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);
        oneToSix.add(numberSixButton);

        List<Button> oneToSix2 = new ArrayList<>();
        oneToSix2.add(numberOneButton2);
        oneToSix2.add(numberTwoButton2);
        oneToSix2.add(numberThreeButton2);
        oneToSix2.add(numberFourButton2);
        oneToSix2.add(numberFiveButton2);
        oneToSix2.add(numberSixButton2);

        List<Button> oneToSix3 = new ArrayList<>();
        oneToSix3.add(numberOneButton3);
        oneToSix3.add(numberTwoButton3);
        oneToSix3.add(numberThreeButton3);
        oneToSix3.add(numberFourButton3);
        oneToSix3.add(numberFiveButton3);
        oneToSix3.add(numberSixButton3);

        List<Button> oneToSix4 = new ArrayList<>();
        oneToSix4.add(numberOneButton4);
        oneToSix4.add(numberTwoButton4);
        oneToSix4.add(numberThreeButton4);
        oneToSix4.add(numberFourButton4);
        oneToSix4.add(numberFiveButton4);
        oneToSix4.add(numberSixButton4);


        List<Button> optionsButton = new ArrayList<>();
        optionsButton.clear();
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
        for (int i=0; i<oneToSix.size(); i++){
            if (opitons.get(2)==Integer.parseInt(oneToSix3.get(i).getText()) ){
                optionsButton.add(oneToSix3.get(i));
            }
        }
        for (int i=0; i<oneToSix.size(); i++){
            if (opitons.get(3)==Integer.parseInt(oneToSix4.get(i).getText()) ){
                optionsButton.add(oneToSix4.get(i));
            }
        }

        VBox layout = new VBox(5);
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
        layout.getChildren().addAll(label, numbers, ok);


        layout.setAlignment(Pos.CENTER);
        layout.setId("ViewZombiesWindow");
        Scene scene = new Scene(layout,600,450);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();



    }

}
