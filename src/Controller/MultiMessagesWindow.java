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
import java.util.ArrayList;
import java.util.List;

public class MultiMessagesWindow {


        public static void display(List<String> messages, String message){
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Please read the below message");


            VBox layout = new VBox(20);
            layout.setPadding(new Insets(10, 10, 10, 10));
            Label label = new Label();
            label.setText(message);
            label.setId("text");
            label.setWrapText(true);
            label.setPadding(new Insets(0, 10, 0, 10));
//            AnchorPane.setTopAnchor(label,50.0);
//            AnchorPane.setLeftAnchor(label,50.0);
//            AnchorPane.setRightAnchor(label,50.0);


            try {
                // load a custom font from a specific location (change path!)
                // 12 is the size to use
                final Font f = Font.loadFont(new FileInputStream(new File("C:\\Users\\Dexter\\IdeaProjects\\MallofHorrorFX\\src\\Controller\\digital-7.ttf")), 25);
                label.setFont(f); // use this font with our label
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            Button ok = new Button("");
            ok.setId("msgokbttn");

            //Clicking will set answer and close window
            ok.setOnAction(e -> {
                window.close();
            });


            Label label1= new Label();
            Label label2= new Label();
            Label label3= new Label();
            Label label4= new Label();
            Label label5= new Label();
            Label label6= new Label();
            Label label7 = new Label();
            Label label8 = new Label();
            Label label9 = new Label();
            Label label10 = new Label();

            List<Label> totalLabels= new ArrayList<>();
            totalLabels.add(label1);
            totalLabels.add(label2);
            totalLabels.add(label3);
            totalLabels.add(label4);
            totalLabels.add(label5);
            totalLabels.add(label6);
            totalLabels.add(label7);
            totalLabels.add(label8);
            totalLabels.add(label9);
            totalLabels.add(label10);


            List<Label> labels = new ArrayList<>();

            for (int i=0; i<messages.size(); i++){
                Label currentLabel = totalLabels.get(i);
                currentLabel.setText(messages.get(i));
                currentLabel.setId("text");
                currentLabel.setWrapText(true);
                currentLabel.setPadding(new Insets(0, 10, 0, 10));
                try {
                    // load a custom font from a specific location (change path!)
                    // 12 is the size to use
                    final Font f = Font.loadFont(new FileInputStream(new File("..\\MallofHorrorFX\\src\\Controller\\digital-7.ttf")), 25);
                    currentLabel.setFont(f); // use this font with our label
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                labels.add(currentLabel);
            }



            layout.getChildren().add(label);
            for (int i=0; i<labels.size(); i++){
                layout.getChildren().addAll(labels.get(i));
            }
            layout.getChildren().addAll(ok);

            layout.setAlignment(Pos.CENTER);
            layout.setId("multiplemsgbg");
            Scene scene = new Scene(layout,600,450);
            File f = new File("..\\MallofHorrorFX\\src\\Controller\\numberwindow.css");
            scene.getStylesheets().clear();
            scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));;
            window.setScene(scene);
            window.showAndWait();



        }
}


