package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewVotingSummaryWindow {

    public static void display(HashMap<String, Integer> results, String message) {
        Stage window = new Stage();
        window.setTitle("Voting Results are..");
        window.setMinWidth(250);


        AnchorPane layout = new AnchorPane();

        Label label = new Label();
        label.setText(message);
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(10, 10, 10, 10));
        label.setMinWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        AnchorPane.setTopAnchor(label,10.0);
        AnchorPane.setLeftAnchor(label,20.0);
        AnchorPane.setRightAnchor(label,20.0);

//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
        InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
        final Font f1 = Font.loadFont(is, 28);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        label.setFont(f1);

        Label red = new Label("0");
        red.setId("REd");
        red.setFont(f1); // use this font with our label
        red.setStyle( "-fx-text-fill: red;");
        AnchorPane.setTopAnchor(red,115.0);
        AnchorPane.setLeftAnchor(red,125.0);

        Label yellow = new Label("0");
        yellow.setId("YELLow");
        yellow.setFont(f1); // use this font with our label
        yellow.setStyle( "-fx-text-fill: yellow;");
        AnchorPane.setTopAnchor(yellow,166.0);
        AnchorPane.setLeftAnchor(yellow,125.0 );

        Label blue = new Label("0");
        blue.setId("BLue");
        blue.setFont(f1); // use this font with our label
        blue.setStyle( "-fx-text-fill: blue;");
        AnchorPane.setTopAnchor(blue,212.0);
        AnchorPane.setLeftAnchor(blue,125.0 );

        Label green = new Label("0");
        green.setId("GREen");
        green.setFont(f1); // use this font with our label
        green.setStyle( "-fx-text-fill: green;");
        AnchorPane.setTopAnchor(green,115.0);
        AnchorPane.setLeftAnchor(green,320.0 );

        Label brown = new Label("0");
        brown.setId("BROwn");
        brown.setFont(f1); // use this font with our label
        brown.setStyle( "-fx-text-fill: brown;");
        AnchorPane.setTopAnchor(brown,166.0);
        AnchorPane.setLeftAnchor(brown,320.0 );

        Label black = new Label("0");
        black.setId("BLAck");
        black.setFont(f1); // use this font with our label
        black.setStyle( "-fx-text-fill: white;");
        AnchorPane.setTopAnchor(black,212.0);
        AnchorPane.setLeftAnchor(black,320.0 );

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
        AnchorPane.setLeftAnchor(ok,170.0);
        AnchorPane.setBottomAnchor(ok,10.0);

        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });

        for (Label labe: labels){
            layout.getChildren().add(labe);
        }


        layout.getChildren().add(label);
        layout.getChildren().add(ok);

        layout.setId("ViewVotingSummaryWindow");
        Scene scene = new Scene(layout, 400, 300);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
        ;
        window.setScene(scene);
        window.showAndWait();

    }
}
