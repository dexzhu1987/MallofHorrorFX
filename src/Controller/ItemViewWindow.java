package Controller;

import Model.Character.GameCharacter;
import Model.Item.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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

public class ItemViewWindow {

        public static void display(List<Item> items ){
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Items");

            AnchorPane layout = new AnchorPane();

            FlowPane flowPane = new FlowPane();
            flowPane.setPadding(new Insets(90, 10, 10, 10));
            flowPane.setVgap(5);
            flowPane.setHgap(10);


            Button threat = new Button();
            threat.setId("threat");
            Button securityCamera = new Button();
            securityCamera.setId("securityCamera");
            Button axe = new Button();
            axe.setId("axe");
            Button shotGun = new Button();
            shotGun.setId("shotGun");
            Button hareware = new Button();
            hareware.setId("hareware");
            Button hidden = new Button();
            hidden.setId("hidden");
            Button sprint = new Button();
            sprint.setId("sprint");
            List<Button> itemsBttns = new ArrayList<>();
            itemsBttns.add(threat);
            itemsBttns.add(securityCamera);
            itemsBttns.add(axe);
            itemsBttns.add(shotGun);
            itemsBttns.add(hareware);
            itemsBttns.add(hidden);
            itemsBttns.add(sprint);


            Button threat2 = new Button();
            threat2.setId("threat");
            Button securityCamera2 = new Button();
            securityCamera2.setId("securityCamera");
            Button axe2 = new Button();
            axe2.setId("axe");
            Button shotGun2 = new Button();
            shotGun2.setId("shotGun");
            Button hareware2 = new Button();
            hareware2.setId("hareware");
            Button hidden2 = new Button();
            hidden2.setId("hidden");
            Button sprint2 = new Button();
            sprint2.setId("sprint");
            List<Button> itemsBttns2 = new ArrayList<>();
            itemsBttns2.add(threat2);
            itemsBttns2.add(securityCamera2);
            itemsBttns2.add(axe2);
            itemsBttns2.add(shotGun2);
            itemsBttns2.add(hareware2);
            itemsBttns2.add(hidden2);
            itemsBttns2.add(sprint2);

            Button threat3 = new Button();
            threat3.setId("threat");
            Button securityCamera3 = new Button();
            securityCamera3.setId("securityCamera");
            Button axe3 = new Button();
            axe3.setId("axe");
            Button shotGun3 = new Button();
            shotGun3.setId("shotGun");
            Button hareware3 = new Button();
            hareware3.setId("hareware");
            Button hidden3 = new Button();
            hidden3.setId("hidden");
            Button sprint3 = new Button();
            sprint3.setId("sprint");
            List<Button> itemsBttns3 = new ArrayList<>();
            itemsBttns3.add(threat3);
            itemsBttns3.add(securityCamera3);
            itemsBttns3.add(axe3);
            itemsBttns3.add(shotGun3);
            itemsBttns3.add(hareware3);
            itemsBttns3.add(hidden3);
            itemsBttns3.add(sprint3);

            Button threat4 = new Button();
            threat4.setId("threat");
            Button securityCamera4 = new Button();
            securityCamera4.setId("securityCamera");
            Button axe4 = new Button();
            axe4.setId("axe");
            Button shotGun4 = new Button();
            shotGun4.setId("shotGun");
            Button hareware4 = new Button();
            hareware4.setId("hareware");
            Button hidden4 = new Button();
            hidden4.setId("hidden");
            Button sprint4 = new Button();
            sprint4.setId("sprint");
            List<Button> itemsBttns4 = new ArrayList<>();
            itemsBttns4.add(threat4);
            itemsBttns4.add(securityCamera4);
            itemsBttns4.add(axe4);
            itemsBttns4.add(shotGun4);
            itemsBttns4.add(hareware4);
            itemsBttns4.add(hidden4);
            itemsBttns4.add(sprint4);

            Button threat5 = new Button();
            threat5.setId("threat");
            Button securityCamera5 = new Button();
            securityCamera5.setId("securityCamera");
            Button axe5 = new Button();
            axe5.setId("axe");
            Button shotGun5 = new Button();
            shotGun5.setId("shotGun");
            Button hareware5 = new Button();
            hareware5.setId("hareware");
            Button hidden5 = new Button();
            hidden5.setId("hidden");
            Button sprint5 = new Button();
            sprint5.setId("sprint");
            List<Button> itemsBttns5 = new ArrayList<>();
            itemsBttns5.add(threat5);
            itemsBttns5.add(securityCamera5);
            itemsBttns5.add(axe5);
            itemsBttns5.add(shotGun5);
            itemsBttns5.add(hareware5);
            itemsBttns5.add(hidden5);
            itemsBttns5.add(sprint5);

            Button threat6 = new Button();
            threat6.setId("threat");
            Button securityCamera6 = new Button();
            securityCamera6.setId("securityCamera");
            Button axe6 = new Button();
            axe6.setId("axe");
            Button shotGun6 = new Button();
            shotGun6.setId("shotGun");
            Button hareware6 = new Button();
            hareware6.setId("hareware");
            Button hidden6 = new Button();
            hidden6.setId("hidden");
            Button sprint6 = new Button();
            sprint6.setId("sprint");
            List<Button> itemsBttns6 = new ArrayList<>();
            itemsBttns6.add(threat6);
            itemsBttns6.add(securityCamera6);
            itemsBttns6.add(axe6);
            itemsBttns6.add(shotGun6);
            itemsBttns6.add(hareware6);
            itemsBttns6.add(hidden6);
            itemsBttns6.add(sprint6);






            if (items.size()>0){
                switch (items.size()){
                    case 6:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(5).getName().equalsIgnoreCase(itemsBttns.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns.get(i));
                            }
                        }
                    case 5:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(4).getName().equalsIgnoreCase(itemsBttns2.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns2.get(i));
                            }
                        }
                    case 4:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(3).getName().equalsIgnoreCase(itemsBttns3.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns3.get(i));
                            }
                        }
                    case 3:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(2).getName().equalsIgnoreCase(itemsBttns4.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns4.get(i));
                            }
                        }
                    case 2:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(1).getName().equalsIgnoreCase(itemsBttns5.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns5.get(i));
                            }
                        }
                    case 1:
                        for (int i=0; i<itemsBttns.size(); i++){
                            if (items.get(0).getName().equalsIgnoreCase(itemsBttns6.get(i).getId())){
                                flowPane.getChildren().add(itemsBttns6.get(i));
                            }
                        }
                }
            }



            Button ok = new Button("");
            ok.setId("roomViewOk");
            //Clicking will set answer and close window
            ok.setOnAction(e -> {
                window.close();
            });
            AnchorPane.setLeftAnchor(ok,292.5);
            AnchorPane.setBottomAnchor(ok,20.0);

            layout.getChildren().addAll(flowPane,ok);
            layout.setId("viewitembg");
            Scene scene = new Scene(layout,670,520);
            File f = new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
            scene.getStylesheets().clear();
            scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
            window.setScene(scene);
            window.showAndWait();


        }
    }


