package Controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleMessageWindow {

    public static void display(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Please read the below message");
        window.setMinWidth(250);


        AnchorPane layout = new AnchorPane();
        Label label = new Label();
        label.setText(message);
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(30, 10, 30, 10));
        AnchorPane.setTopAnchor(label,50.0);
        AnchorPane.setLeftAnchor(label,50.0);
        AnchorPane.setRightAnchor(label,50.0);


//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
            InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
            final Font f1 = Font.loadFont(is, 25);
            label.setFont(f1); // use this font with our label
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Button ok = new Button("");
        ok.setId("msgokbttn");
        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });
        AnchorPane.setLeftAnchor(ok,162.5);
        AnchorPane.setBottomAnchor(ok,25.0);



        layout.getChildren().add(label);
        layout.getChildren().addAll(ok);



        layout.setId("simplemsgbg");
        Scene scene = new Scene(layout,400,300);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();



    }
}
