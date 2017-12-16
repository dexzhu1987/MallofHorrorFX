package Controller;

import Model.Dice.PairofDice;
import Model.Game.Game;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController {

    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label rollResult_1, rollResult_2, continueLabel, label_1, label_2, label_3, label_4;
    @FXML
    private TextField inputName_1, inputName_2, inputName_3, inputName_4;



    private PairofDice roll = new PairofDice();
    private Game run = new Game();

    //Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to format your system?");

    public class bg_Thread implements Runnable{

        @Override
        public void run(){
            for(int i = 0; i <= 100; i++){
                progressBar.setProgress(i / 100.0);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        // Update UI here.
                        continueLabel.setText("Loading.....");
                    }
                });
                if(i == 100){
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            continueLabel.setText("Done.....");
                        }
                    });
                }

            }
        }
    }

    public void initialize(URL url, ResourceBundle rb){
        progressBar.setProgress(0.0);
    }
    @FXML
    public void progressBtn(){
        Thread th = new Thread(new bg_Thread());
        th.start();
    }

    @FXML
    public void StartGameBtn(ActionEvent event)throws IOException{
        Parent startRoot = FXMLLoader.load(getClass().getResource("../View/StartGame.fxml"));
        Scene startScene = new Scene(startRoot);
        Stage start_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        start_stage.setScene(startScene);
        start_stage.show();

    }

    @FXML
    public void NextBtn(ActionEvent event)throws IOException{
        Parent nextRoot = FXMLLoader.load(getClass().getResource("../View/BoardRoom.fxml"));
        Scene nextScene = new Scene(nextRoot);
        Stage next_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        next_stage.setScene(nextScene);
        next_stage.show();

    }

    @FXML
    public void BackBtn(ActionEvent event)throws IOException{
        Parent backRoot = FXMLLoader.load(getClass().getResource("../View/Main.fxml"));
        Scene backScene = new Scene(backRoot);
        Stage back_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        back_stage.setScene(backScene);
        back_stage.show();
    }

    @FXML
    public void closeBtn(ActionEvent event)throws IOException{
        Parent closeRoot = FXMLLoader.load(getClass().getResource("../View/Main.fxml"));
        Scene closeScene = new Scene(closeRoot);
        Stage close_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        close_stage.setScene(closeScene);
        close_stage.close();
    }

    @FXML
    public void RuleBtn(ActionEvent event)throws IOException{
        Parent ruleRoot = FXMLLoader.load(getClass().getResource("../View/Rule.fxml"));
        Scene ruleScene = new Scene(ruleRoot);
        Stage rule_stage = new Stage();
        rule_stage.setScene(ruleScene);
        rule_stage.show();
    }

    @FXML
    public void rollBtn(){
        roll.rollDieOne();
        roll.rollDieTwo();
        rollResult_1.setFont(Font.font(20));
        rollResult_1.setTextFill(Color.RED);
        rollResult_2.setFont(Font.font(20));
        rollResult_2.setTextFill(Color.RED);
        rollResult_1.setText(Integer.toString(roll.getDieOneFace()));
        rollResult_2.setText(Integer.toString(roll.getDieTwoFace()));
    }

    @FXML
    public void SelectNameBtn(){
            label_1.textProperty().bind(inputName_1.textProperty());
            label_2.textProperty().bind(inputName_2.textProperty());
            label_3.textProperty().bind(inputName_3.textProperty());
            label_4.textProperty().bind(inputName_4.textProperty());

    }
    @FXML
    public void RunGameBtn(){
        //printOut_Label.setText("Hello");
        run.MainLogic();

    }


//    public static void create(TextArea textarea) {
//        PrintStream stream = new PrintStream(System.out) {
//            @Override
//            public void print(String text) {
//                textarea.setText(text + "\n");
//            }
//        };
//        System.setOut(stream);
//    }


}
