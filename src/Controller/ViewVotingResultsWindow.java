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
        final Font f1 = Font.loadFont(is, 28);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Button numberZeroButton = new Button("");
        numberZeroButton.setId("RED");
        AnchorPane.setTopAnchor(numberZeroButton,73.0);
        AnchorPane.setLeftAnchor(numberZeroButton,423.0 );
        Button numberOneButton = new Button("");
        AnchorPane.setTopAnchor(numberOneButton,106.0);
        AnchorPane.setLeftAnchor(numberOneButton,423.0 );
        numberOneButton.setId("YELLOW");
        Button numberTwoButton = new Button("");
        numberTwoButton.setId("BLUE");
        AnchorPane.setTopAnchor(numberTwoButton,142.0);
        AnchorPane.setLeftAnchor(numberTwoButton,423.0 );
        Button numberThreeButton = new Button("");
        numberThreeButton.setId("GREEN");
        AnchorPane.setTopAnchor(numberThreeButton,177.0);
        AnchorPane.setLeftAnchor(numberThreeButton,423.0 );
        Button numberFourButton = new Button("");
        numberFourButton.setId("BROWN");
        AnchorPane.setTopAnchor(numberFourButton,210.0);
        AnchorPane.setLeftAnchor(numberFourButton,423.0 );
        Button numberFiveButton = new Button("");
        numberFiveButton.setId("BLACK");
        AnchorPane.setTopAnchor(numberFiveButton,243.0);
        AnchorPane.setLeftAnchor(numberFiveButton,423.0 );


        List<Button> oneToSix = new ArrayList<>();
        oneToSix.add(numberZeroButton);
        oneToSix.add(numberOneButton);
        oneToSix.add(numberTwoButton);
        oneToSix.add(numberThreeButton);
        oneToSix.add(numberFourButton);
        oneToSix.add(numberFiveButton);


        for (int i = 0; i < colors.size(); i+=2) {
            for (int q=0; q<oneToSix.size(); q++){
                if (colors.get(i).equalsIgnoreCase(oneToSix.get(q).getId())) {
                    oneToSix.get(q).setId(colors.get(i+1)+"act");
                }
            }
        }

        Label red = new Label("0");
        red.setId("REd");
        red.setFont(f1); // use this font with our label
        red.setStyle( "-fx-text-fill: red;");
        AnchorPane.setTopAnchor(red,320.0);
        AnchorPane.setLeftAnchor(red,142.0 );

        Label yellow = new Label("0");
        yellow.setId("YELLow");
        yellow.setFont(f1); // use this font with our label
        yellow.setStyle( "-fx-text-fill: yellow;");
        AnchorPane.setTopAnchor(yellow,354.0);
        AnchorPane.setLeftAnchor(yellow,142.0 );

        Label blue = new Label("0");
        blue.setId("BLue");
        blue.setFont(f1); // use this font with our label
        blue.setStyle( "-fx-text-fill: blue;");
        AnchorPane.setTopAnchor(blue,320.0);
        AnchorPane.setLeftAnchor(blue,331.0 );

        Label green = new Label("0");
        green.setId("GREen");
        green.setFont(f1); // use this font with our label
        green.setStyle( "-fx-text-fill: green;");
        AnchorPane.setTopAnchor(green,354.0);
        AnchorPane.setLeftAnchor(green,331.0 );

        Label brown = new Label("0");
        brown.setId("BROwn");
        brown.setFont(f1); // use this font with our label
        brown.setStyle( "-fx-text-fill: brown;");
        AnchorPane.setTopAnchor(brown,320.0);
        AnchorPane.setLeftAnchor(brown,525.0 );

        Label black = new Label("0");
        black.setId("BLAck");
        black.setFont(f1); // use this font with our label
        black.setStyle( "-fx-text-fill: white;");
        AnchorPane.setTopAnchor(black,354.0);
        AnchorPane.setLeftAnchor(black,525.0 );

        List<Label> labels = new ArrayList<>();
        labels.add(red);
        labels.add(yellow);
        labels.add(blue);
        labels.add(green);
        labels.add(brown);
        labels.add(black);

        List<String> keys = new ArrayList<>(results.keySet());
        List<Integer> values= new ArrayList<>(results.values());

        for (int i=0; i<keys.size(); i++){
            for (int q=0; q<labels.size(); q++)
            if (keys.get(i).equalsIgnoreCase(labels.get(q).getId())){
                labels.get(q).setText(Integer.toString(values.get(i)) );
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
        for (Button button: oneToSix){
            layout.getChildren().add(button);
        }

        for (Label label: labels){
            layout.getChildren().add(label);
        }


        layout.setId("votingWindowBg");
        Scene scene = new Scene(layout, 600, 450);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        ;
        window.setScene(scene);
        window.showAndWait();

    }
}