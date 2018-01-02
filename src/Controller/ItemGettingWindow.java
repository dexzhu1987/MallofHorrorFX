package Controller;

import Model.Item.Item;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

public class ItemGettingWindow {
    public static void display(Item item){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Item");

        AnchorPane layout = new AnchorPane();

        Label label = new Label();
        label.setText("You get");
        label.setId("text");
        label.setWrapText(true);
        label.setPadding(new Insets(10, 10, 10, 10));
        label.setMinWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);
//        try {
//            // load a custom font from a specific location (change path!)
//            // 12 is the size to use
            InputStream is = numberWindow.class.getResourceAsStream("digital-7.ttf");
            final Font f1 = Font.loadFont(is, 25);
            label.setFont(f1); // use this font with our label
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        AnchorPane.setTopAnchor(label,15.0);
        AnchorPane.setLeftAnchor(label,20.0);
        AnchorPane.setRightAnchor(label,20.0);


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


        for (int i=0; i<itemsBttns.size(); i++) {
            if (item.getName().equalsIgnoreCase(itemsBttns.get(i).getId())) {
                layout.getChildren().add(itemsBttns.get(i));
                AnchorPane.setTopAnchor(itemsBttns.get(i), 70.0);
                AnchorPane.setLeftAnchor(itemsBttns.get(i), 80.0);
            }
        }

        Button ok = new Button("");
        ok.setId("msgokbttn");
        //Clicking will set answer and close window
        ok.setOnAction(e -> {
            window.close();
        });
        AnchorPane.setLeftAnchor(ok,112.5);
        AnchorPane.setBottomAnchor(ok,20.0);

        layout.getChildren().addAll(ok,label);
        layout.setId("ItemGettingWindow");
        Scene scene = new Scene(layout,300,357.5);
        File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
        window.setScene(scene);
        window.showAndWait();


    }
}
