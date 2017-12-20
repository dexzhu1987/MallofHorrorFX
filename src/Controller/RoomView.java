package Controller;

import Model.Room.*;
import java.util.*;
import Model.Character.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RoomView {
    public static void display(List<Room> rooms ){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("View Room");
        window.setMinWidth(250);

        GridPane layout = new GridPane();

        Label label = new Label();
        label.setText("Current Room Status");
        GridPane.setConstraints(label,1,0);





        VBox room1= new VBox();
        room1.setMinWidth(170);
        room1.setMaxHeight(110);
        room1.setPadding(new Insets(10, 10, 10, 10));
        Label roomName1 = new Label("ROOM:1 Rest Room");
        StackPane capacitystack1 = new StackPane();
        Label capacity1 = new Label("Capacity: 3");
        capacitystack1.getChildren().add(capacity1);
        capacitystack1.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas1 = new GridPane();
        StackPane currentZombiestack1 = new StackPane();
        Label currentZombie1 = new Label("CurrentZombie:       ");
        Label currentZombieNum1 = new Label(Integer.toString(rooms.get(0).getCurrentZombienumber()) );
        currentZombiestack1.getChildren().addAll(currentZombie1,currentZombieNum1);
        currentZombiestack1.setAlignment(Pos.CENTER_RIGHT);
        room1.getChildren().addAll(roomName1,capacitystack1,roomHas1,currentZombiestack1);
        GridPane.setConstraints(room1,0,1);

        VBox room2= new VBox();
        room2.setMinWidth(170);
        room2.setMaxHeight(110);
        room2.setPadding(new Insets(10, 10, 10, 10));
        Label roomName2 = new Label("ROOM:2 Cachou");
        StackPane capacitystack2 = new StackPane();
        Label capacity2 = new Label("Capacity: 4");
        capacitystack2.getChildren().add(capacity2);
        capacitystack2.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas2 = new GridPane();
        StackPane currentZombiestack2 = new StackPane();
        Label currentZombie2 = new Label("CurrentZombie:       ");
        Label currentZombieNum2 = new Label(Integer.toString(rooms.get(1).getCurrentZombienumber()) );
        currentZombiestack2.getChildren().addAll(currentZombie2,currentZombieNum2);
        currentZombiestack2.setAlignment(Pos.CENTER_RIGHT);
        room2.getChildren().addAll(roomName2,capacitystack2,roomHas2,currentZombiestack2);
        GridPane.setConstraints(room2,1,1);

        VBox room3= new VBox();
        room3.setMinWidth(170);
        room3.setMaxHeight(110);
        room2.setPadding(new Insets(10, 10, 10, 10));
        Label roomName3 = new Label("ROOM:3 Megatoys");
        StackPane capacitystack3 = new StackPane();
        Label capacity3 = new Label("Capacity: 4");
        capacitystack3.getChildren().add(capacity3);
        capacitystack3.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas3 = new GridPane();
        StackPane currentZombiestack3 = new StackPane();
        Label currentZombie3 = new Label("CurrentZombie:       ");
        Label currentZombieNum3 = new Label(Integer.toString(rooms.get(2).getCurrentZombienumber()) );
        currentZombiestack3.getChildren().addAll(currentZombie3,currentZombieNum3);
        currentZombiestack3.setAlignment(Pos.CENTER_RIGHT);
        room3.getChildren().addAll(roomName3,capacitystack3,roomHas3,currentZombiestack3);
        GridPane.setConstraints(room3,2,1);

        VBox room4= new VBox();
        room4.setMinWidth(170);
        room4.setMaxHeight(110);
        room4.setPadding(new Insets(10, 10, 10, 10));
        Label roomName4 = new Label("ROOM:4 Parking");
        StackPane capacitystack4 = new StackPane();
        Label capacity4 = new Label("Capacity: 99");
        capacitystack4.getChildren().add(capacity4);
        capacitystack4.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas4 = new GridPane();
        StackPane currentZombiestack4 = new StackPane();
        Label currentZombie4 = new Label("CurrentZombie:       ");
        Label currentZombieNum4 = new Label(Integer.toString(rooms.get(3).getCurrentZombienumber()) );
        currentZombiestack4.getChildren().addAll(currentZombie4,currentZombieNum4);
        currentZombiestack4.setAlignment(Pos.CENTER_RIGHT);
        room4.getChildren().addAll(roomName4,capacitystack4,roomHas4,currentZombiestack4);
        GridPane.setConstraints(room4,0,2);

        VBox room5= new VBox();
        room5.setMinWidth(170);
        room5.setMaxHeight(110);
        room5.setPadding(new Insets(10, 10, 10, 10));
        Label roomName5 = new Label("ROOM:5 SecurityHQ");
        StackPane capacitystack5 = new StackPane();
        Label capacity5 = new Label("Capacity: 5");
        capacitystack5.getChildren().add(capacity5);
        capacitystack5.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas5 = new GridPane();
        StackPane currentZombiestack5 = new StackPane();
        Label currentZombie5 = new Label("CurrentZombie:       ");
        Label currentZombieNum5 = new Label(Integer.toString(rooms.get(4).getCurrentZombienumber()) );
        currentZombiestack5.getChildren().addAll(currentZombie5,currentZombieNum5);
        currentZombiestack5.setAlignment(Pos.CENTER_RIGHT);
        room5.getChildren().addAll(roomName5,capacitystack5,roomHas5,currentZombiestack5);
        GridPane.setConstraints(room5,1,2);

        VBox room6= new VBox();
        room6.setMinWidth(170);
        room6.setMaxHeight(110);
        room6.setPadding(new Insets(10, 10, 10, 10));
        Label roomName6 = new Label("ROOM:6 SuperMarket");
        StackPane capacitystack6 = new StackPane();
        Label capacity6 = new Label("Capacity: 6");
        capacitystack6.getChildren().add(capacity6);
        capacitystack6.setAlignment(Pos.CENTER_RIGHT);
        GridPane roomHas6 = new GridPane();
        StackPane currentZombiestack6 = new StackPane();
        Label currentZombie6 = new Label("CurrentZombie:       ");
        Label currentZombieNum6 = new Label(Integer.toString(rooms.get(5).getCurrentZombienumber()) );
        currentZombiestack6.getChildren().addAll(currentZombie6,currentZombieNum6);
        currentZombiestack6.setAlignment(Pos.CENTER_RIGHT);
        room6.getChildren().addAll(roomName6,capacitystack6,roomHas6,currentZombiestack6);
        VBox confirm= new VBox();
        GridPane.setConstraints(room6,2,2);

        Button ok = new Button("OK");
        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });
        GridPane.setConstraints(ok,1,3);
        layout.getChildren().addAll(label,room1,room2,room3,room4,room5,room6,ok);




        Label redGunMan = new Label("Red Gun Man");
        Label redToughGuy = new Label("Red Tough Guy");
        Label redModel = new Label("Red Model");

        Label yellowGunMan = new Label("Yellow Gun Man");
        Label yellowToughGuy = new Label("Yellow Tough Guy");
        Label yellowModel = new Label("Yellow Model");

        Label blueGunMan = new Label("Blue Gun Man");
        Label blueToughGuy = new Label("Blue Tough Guy");
        Label blueModel = new Label("Blue Model");

        Label greenGunMan = new Label("Green Gun Man");
        Label greenToughGuy = new Label("Green Tough Guy");
        Label greenModel = new Label("Green Model");

        Label brownGunMan = new Label("Brown Gun Man");
        Label brownToughGuy = new Label("Brown Tough Guy");
        Label brownModel = new Label("Brown Model");

        Label blackGunMan = new Label("Black Gun Man");
        Label blackToughGuy = new Label("Black Tough Guy");
        Label blackModel = new Label("Black  Model");

        List<GridPane> roomHasList = new ArrayList<>();
        roomHasList.add(roomHas1);
        roomHasList.add(roomHas2);
        roomHasList.add(roomHas3);
        roomHasList.add(roomHas4);
        roomHasList.add(roomHas5);
        roomHasList.add(roomHas6);

        for (int i=0; i<rooms.size(); i++ ) {
            List<Label> roomLabel = new ArrayList<>();
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
                currentPane.add(roomLabel.get(k),col,row);
                col++;
                if (col>4){
                    row++;
                    col=0;
                }
            }
        }








        Scene scene = new Scene(layout,600,400);
        window.setScene(scene);
        window.showAndWait();


    }
}
