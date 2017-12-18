package Controller;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MultiMessagesWindow {


        public static void display(List<String> messages, String message){
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("Please read the below message");
            window.setMinWidth(250);
            Label label = new Label();
            label.setText(message);

            Button ok = new Button("OK");


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
                totalLabels.get(i).setText(messages.get(i));
                labels.add(totalLabels.get(i));
            }


            VBox layout = new VBox(10);
            layout.getChildren().add(label);
            for (int i=0; i<labels.size(); i++){
                layout.getChildren().addAll(labels.get(i));
            }
            layout.getChildren().addAll(ok);

            layout.setAlignment(Pos.CENTER);
            Scene scene = new Scene(layout);
            window.setScene(scene);
            window.showAndWait();



        }
}


