package Controller;

import Model.Room.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import Model.Character.*;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RoomView {
    public static void display(List<Room> rooms ){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("View Room");
        window.setMinWidth(250);

        AnchorPane layout = new AnchorPane();


        GridPane roomHas1 = new GridPane();
        Label currentZombieNum1 = new Label(Integer.toString(rooms.get(0).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas1,33.0);
        AnchorPane.setTopAnchor(roomHas1,106.0);
        AnchorPane.setLeftAnchor(currentZombieNum1,215.0);
        AnchorPane.setTopAnchor(currentZombieNum1,158.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum1.setFont(f); // use this font with our label
            currentZombieNum1.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        GridPane roomHas2 = new GridPane();
        Label currentZombieNum2 = new Label(Integer.toString(rooms.get(1).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas2,286.0);
        AnchorPane.setTopAnchor(roomHas2,106.0);
        AnchorPane.setLeftAnchor(currentZombieNum2,470.0);
        AnchorPane.setTopAnchor(currentZombieNum2,158.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum2.setFont(f); // use this font with our label
            currentZombieNum2.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        GridPane roomHas3 = new GridPane();
        Label currentZombieNum3 = new Label(Integer.toString(rooms.get(2).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas3,535.0);
        AnchorPane.setTopAnchor(roomHas3,106.0);
        AnchorPane.setLeftAnchor(currentZombieNum3,706.0);
        AnchorPane.setTopAnchor(currentZombieNum3,158.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum3.setFont(f); // use this font with our label
            currentZombieNum3.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        GridPane roomHas4 = new GridPane();
        Label currentZombieNum4 = new Label(Integer.toString(rooms.get(3).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas4,33.0);
        AnchorPane.setTopAnchor(roomHas4,277.0);
        AnchorPane.setLeftAnchor(currentZombieNum4,215.0);
        AnchorPane.setTopAnchor(currentZombieNum4,330.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum4.setFont(f); // use this font with our label
            currentZombieNum4.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        GridPane roomHas5 = new GridPane();
        Label currentZombieNum5 = new Label(Integer.toString(rooms.get(4).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas5,286.0);
        AnchorPane.setTopAnchor(roomHas5,277.0);
        AnchorPane.setLeftAnchor(currentZombieNum5,466.0);
        AnchorPane.setTopAnchor(currentZombieNum5,330.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum5.setFont(f); // use this font with our label
            currentZombieNum5.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        GridPane roomHas6 = new GridPane();
        Label currentZombieNum6 = new Label(Integer.toString(rooms.get(5).getCurrentZombienumber()) );
        AnchorPane.setLeftAnchor(roomHas6,535.0);
        AnchorPane.setTopAnchor(roomHas6,277.0);
        AnchorPane.setLeftAnchor(currentZombieNum6,710.0);
        AnchorPane.setTopAnchor(currentZombieNum6,330.0);

        try {
            // load a custom font from a specific location (change path!)
            // 12 is the size to use
            final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\Exquisite Corpse.ttf")), 43);
            currentZombieNum6.setFont(f); // use this font with our label
            currentZombieNum6.setStyle( "-fx-text-fill: red;");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Button ok = new Button("");
        ok.setId("roomViewOk");
        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });
        AnchorPane.setLeftAnchor(ok,325.0);
        AnchorPane.setBottomAnchor(ok,40.0);


        Button redGunMan = new Button("");
        redGunMan.setId("redgunmanbttn");
        Button redToughGuy = new Button("");
        redToughGuy.setId("redtoughguybttn");
        Button redModel = new Button("");
        redModel.setId("redmodelbttn");

        Button yellowGunMan = new Button("");
        yellowGunMan.setId("yellowGunManbttn");
        Button yellowToughGuy = new Button("");
        yellowToughGuy.setId("yellowToughGuybttn");
        Button yellowModel = new Button("");
        yellowModel.setId("yellowModelbttn");

        Button blueGunMan = new Button("");
        blueGunMan.setId("blueGunManbttn");
        Button blueToughGuy = new Button("");
        blueToughGuy.setId("blueToughGuybttn");
        Button blueModel = new Button("");
        blueModel.setId("blueModelbttn");

        Button greenGunMan = new Button("");
        greenGunMan.setId("greenGunManbttn");
        Button greenToughGuy = new Button("");
        greenToughGuy.setId("greenToughGuybttn");
        Button greenModel = new Button("");
        greenModel.setId("greenModelbttn");

        Button brownGunMan = new Button("");
        brownGunMan.setId("brownGunManbttn");
        Button brownToughGuy = new Button("");
        brownToughGuy.setId("brownToughGuybttn");
        Button brownModel = new Button("");
        brownModel.setId("brownModelbttn");

        Button blackGunMan = new Button("");
        blackGunMan.setId("blackGunManbttn");
        Button blackToughGuy = new Button("");
        blackToughGuy.setId("blackToughGuybttn");
        Button blackModel = new Button("");
        blackModel.setId("blackModelbttn");

        List<GridPane> roomHasList = new ArrayList<>();
        roomHasList.add(roomHas1);
        roomHasList.add(roomHas2);
        roomHasList.add(roomHas3);
        roomHasList.add(roomHas4);
        roomHasList.add(roomHas5);
        roomHasList.add(roomHas6);

        for (int i=0; i<rooms.size(); i++ ) {
            List<Button> roomLabel = new ArrayList<>();
            for (int q = 0; q < rooms.get(i).getRoomCharaters().size(); q++) {
                GameCharacter currentCharacter = rooms.get(i).getRoomCharaters().get(q);
                String characterName = currentCharacter.getName();
                String characterColor = currentCharacter.getOwnercolor();
                if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Red")) {
                    roomLabel.add(redGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Red")) {
                    roomLabel.add(redToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Red")) {
                    roomLabel.add(redModel);

                } else if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Yellow")) {
                    roomLabel.add(yellowGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Yellow")) {
                    roomLabel.add(yellowToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Yellow")) {
                    roomLabel.add(yellowModel);

                } else if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Blue")) {
                    roomLabel.add(blueGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Blue")) {
                    roomLabel.add(blueToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Blue")) {
                    roomLabel.add(blueModel);

                } else if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Green")) {
                    roomLabel.add(greenGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Green")) {
                    roomLabel.add(greenToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Green")) {
                    roomLabel.add(greenModel);

                } else if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Brown")) {
                    roomLabel.add(brownGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Brown")) {
                    roomLabel.add(brownToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Brown")) {
                    roomLabel.add(brownModel);

                } else if (characterName.equalsIgnoreCase("Gun Man") && characterColor.equalsIgnoreCase("Black")) {
                    roomLabel.add(blackGunMan);
                } else if (characterName.equalsIgnoreCase("Tough Guy") && characterColor.equalsIgnoreCase("Black")) {
                    roomLabel.add(blackToughGuy);
                } else if (characterName.equalsIgnoreCase("Model") && characterColor.equalsIgnoreCase("Black")) {
                    roomLabel.add(blackModel);
                }
            }
            GridPane currentPane = roomHasList.get(i);
            int col =0;
            int row =0;
            for (int k=0; k<roomLabel.size(); k++){
                currentPane.setMinHeight(100);
                currentPane.setHgap(10);
                currentPane.setVgap(3);
                currentPane.add(roomLabel.get(k),col,row);
                col++;
                if (col>2){
                    row++;
                    col=0;
                }
            }
        }



        layout.getChildren().addAll(roomHas1,roomHas2,roomHas3,roomHas4,roomHas5,roomHas6,
                currentZombieNum1,currentZombieNum2,currentZombieNum3,currentZombieNum4,currentZombieNum5,currentZombieNum6,ok);



        layout.setId("viewRoombg");
        Scene scene = new Scene(layout,750,475);
        File f = new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


    }
}
