package Controller;

import Model.Item.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ChoosingItemWindow {
    static Item item;

    public static Item display(List<Item> items, String message ){
        Stage window = new Stage();

        window.setTitle("Items");
        window.initModality(Modality.APPLICATION_MODAL);
        AnchorPane layout = new AnchorPane();

        Label label = new Label();
        label.setText(message);
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(10, 10, 10, 10));
//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
            InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
            final Font f1 = Font.loadFont(is, 25);
            label.setFont(f1); // use this font with our label
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        AnchorPane.setTopAnchor(label,20.0);
        AnchorPane.setLeftAnchor(label,10.0);
        AnchorPane.setRightAnchor(label,10.0);

        Button threat = new Button();
        threat.setId("threat");
        threat.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera = new Button();
        securityCamera.setId("securityCamera");
        securityCamera.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe = new Button();
        axe.setId("axe");
        axe.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun = new Button();
        shotGun.setId("shotGun");
        shotGun.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware = new Button();
        hareware.setId("hareware");
        hareware.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden = new Button();
        hidden.setId("hidden");
        hidden.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint = new Button();
        sprint.setId("sprint");
        sprint.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
        threat2.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera2 = new Button();
        securityCamera2.setId("securityCamera");
        securityCamera2.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe2 = new Button();
        axe2.setId("axe");
        axe2.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun2 = new Button();
        shotGun2.setId("shotGun");
        shotGun2.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware2 = new Button();
        hareware2.setId("hareware");
        hareware2.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden2 = new Button();
        hidden2.setId("hidden");
        hidden2.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint2 = new Button();
        sprint2.setId("sprint");
        sprint2.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
        threat3.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera3 = new Button();
        securityCamera3.setId("securityCamera");
        securityCamera3.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe3 = new Button();
        axe3.setId("axe");
        axe3.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun3 = new Button();
        shotGun3.setId("shotGun");
        shotGun3.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware3 = new Button();
        hareware3.setId("hareware");
        hareware3.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden3 = new Button();
        hidden3.setId("hidden");
        hidden3.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint3 = new Button();
        sprint3.setId("sprint");
        sprint3.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
        threat4.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera4 = new Button();
        securityCamera4.setId("securityCamera");
        securityCamera4.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe4 = new Button();
        axe4.setId("axe");
        axe4.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun4 = new Button();
        shotGun4.setId("shotGun");
        shotGun4.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware4 = new Button();
        hareware4.setId("hareware");
        hareware4.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden4 = new Button();
        hidden4.setId("hidden");
        hidden4.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint4 = new Button();
        sprint4.setId("sprint");
        sprint4.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
        threat5.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera5 = new Button();
        securityCamera5.setId("securityCamera");
        securityCamera5.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe5 = new Button();
        axe5.setId("axe");
        axe5.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun5 = new Button();
        shotGun5.setId("shotGun");
        shotGun5.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware5 = new Button();
        hareware5.setId("hareware");
        hareware5.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden5 = new Button();
        hidden5.setId("hidden");
        hidden5.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint5 = new Button();
        sprint5.setId("sprint");
        sprint5.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
        threat6.setOnAction(event -> {
            item = new Threat();
            window.close();
        });
        Button securityCamera6 = new Button();
        securityCamera6.setId("securityCamera");
        securityCamera6.setOnAction(event -> {
            item = new SecurityCamera();
            window.close();
        });
        Button axe6 = new Button();
        axe6.setId("axe");
        axe6.setOnAction(event -> {
            item = new Axe();
            window.close();
        });
        Button shotGun6 = new Button();
        shotGun6.setId("shotGun");
        shotGun6.setOnAction(event -> {
            item = new ShotGun();
            window.close();
        });
        Button hareware6 = new Button();
        hareware6.setId("hareware");
        hareware6.setOnAction(event -> {
            item = new Hardware();
            window.close();
        });
        Button hidden6 = new Button();
        hidden6.setId("hidden");
        hidden6.setOnAction(event -> {
            item = new Hidden();
            window.close();
        });
        Button sprint6 = new Button();
        sprint6.setId("sprint");
        sprint6.setOnAction(event -> {
            item = new Sprint();
            window.close();
        });
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
                            layout.getChildren().add(itemsBttns.get(i));
                            AnchorPane.setTopAnchor(itemsBttns.get(i),295.0);
                            AnchorPane.setLeftAnchor(itemsBttns.get(i),310.0);
                        }
                    }
                case 5:
                    for (int i=0; i<itemsBttns.size(); i++){
                        if (items.get(4).getName().equalsIgnoreCase(itemsBttns2.get(i).getId())){
                            layout.getChildren().add(itemsBttns2.get(i));
                            AnchorPane.setTopAnchor(itemsBttns2.get(i),295.0);
                            AnchorPane.setLeftAnchor(itemsBttns2.get(i),160.0);
                        }
                    }
                case 4:
                    for (int i=0; i<itemsBttns.size(); i++){
                        if (items.get(3).getName().equalsIgnoreCase(itemsBttns3.get(i).getId())){
                            layout.getChildren().add(itemsBttns3.get(i));
                            AnchorPane.setTopAnchor(itemsBttns3.get(i),295.0);
                            AnchorPane.setLeftAnchor(itemsBttns3.get(i),10.0);
                        }
                    }
                case 3:
                    for (int i=0; i<itemsBttns.size(); i++){
                        if (items.get(2).getName().equalsIgnoreCase(itemsBttns4.get(i).getId())){
                            layout.getChildren().add(itemsBttns4.get(i));
                            AnchorPane.setTopAnchor(itemsBttns4.get(i),90.0);
                            AnchorPane.setLeftAnchor(itemsBttns4.get(i),310.0);
                        }
                    }
                case 2:
                    for (int i=0; i<itemsBttns.size(); i++){
                        if (items.get(1).getName().equalsIgnoreCase(itemsBttns5.get(i).getId())){
                            layout.getChildren().add(itemsBttns5.get(i));
                            AnchorPane.setTopAnchor(itemsBttns5.get(i),90.0);
                            AnchorPane.setLeftAnchor(itemsBttns5.get(i),160.0);
                        }
                    }
                case 1:
                    for (int i=0; i<itemsBttns.size(); i++){
                        if (items.get(0).getName().equalsIgnoreCase(itemsBttns6.get(i).getId())){
                            layout.getChildren().add(itemsBttns6.get(i));
                            AnchorPane.setTopAnchor(itemsBttns6.get(i),90.0);
                            AnchorPane.setLeftAnchor(itemsBttns6.get(i),10.0);
                        }
                    }
            }
        }



//        Button ok = new Button("");
//        ok.setId("roomViewOk");
//        //Clicking will set answer and close window
//        ok.setOnAction(e -> {
//            window.close();
//        });
//        AnchorPane.setLeftAnchor(ok,192.5);
//        AnchorPane.setBottomAnchor(ok,20.0);
//
//        layout.getChildren().addAll(ok);
        layout.getChildren().add(label);
        layout.setId("choosingitem");
        Scene scene = new Scene(layout,460,510);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();

        return item;
    }

}
