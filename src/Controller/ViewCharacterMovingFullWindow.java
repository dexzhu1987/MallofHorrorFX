package Controller;

import Model.Character.GameCharacter;
import Model.Room.Room;
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

public class ViewCharacterMovingFullWindow {
    public static void display(Room r1, Room r2, GameCharacter gameCharacter) {
        Stage window = new Stage();
        window.setTitle("Character moving to..");
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

        Label label = new Label();
        label.setText("Intended place is full, character has to move to parking ...");
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(10, 10, 10, 10));
        label.setMinWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
        label.setFont(f1);
        AnchorPane.setTopAnchor(label,30.0);
        AnchorPane.setLeftAnchor(label,20.0);
        AnchorPane.setRightAnchor(label,20.0);

        Button room1 = new Button();
        AnchorPane.setTopAnchor(room1,330.0);
        AnchorPane.setLeftAnchor(room1,20.0);
        room1.setId(r1.getName().toLowerCase().replaceAll("\\s","")+"Bttn");

        Button room2 = new Button();
        AnchorPane.setTopAnchor(room2,130.0);
        AnchorPane.setLeftAnchor(room2,230.0);
        room2.setId(r2.getName().toLowerCase().replaceAll("\\s","")+ "Bttn");

        Label full = new Label("full");
        AnchorPane.setLeftAnchor(full,180.0);
        AnchorPane.setTopAnchor(full,370.0);
        InputStream corse = numberWindow.class.getResourceAsStream("Exquisite Corpse.ttf");
        final Font f2 = Font.loadFont(is, 35);
        full.setStyle("-fx-text-fill: red;");

        Button movingCharacter = new Button();
        AnchorPane.setTopAnchor(movingCharacter,170.0);
        AnchorPane.setLeftAnchor(movingCharacter,80.0);
        String nospace = gameCharacter.getClass().getSimpleName();
        String color = gameCharacter.getOwnercolor().toLowerCase();
        movingCharacter.setId(color+nospace+"bttn");
        movingCharacter.setStyle("    -fx-background-size: 90;\n" +
                "    -fx-background-position: center center;\n" +
                "    -fx-min-height: 90px;\n" +
                "    -fx-min-width: 90px;\n" +
                "    -fx-max-width: 90px;\n" +
                "     -fx-max-height: 90px;");

        Button ok = new Button("");
        ok.setId("msgokbttn");
        AnchorPane.setLeftAnchor(ok,300.0);
        AnchorPane.setBottomAnchor(ok,20.0);



        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });


        layout.getChildren().addAll(label,ok);
        layout.getChildren().addAll(room1,room2,full, movingCharacter);

        layout.setId("ViewCharacterMovingFullWindow");
        Scene scene = new Scene(layout, 700, 525);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        ;
        window.setScene(scene);
        window.showAndWait();

    }
}
