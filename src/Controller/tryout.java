package Controller;

import Model.Game.GameBroad;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
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
import javafx.beans.*;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;


public class tryout implements Initializable {
    @FXML
    public static IntegerProperty numberplayer;

    @FXML
    public Label numberplayerlabel ;

    @FXML
    public GameBroad gameBroad;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        numberplayerlabel = new Label();
        numberplayer = new SimpleIntegerProperty();
        gameBroad = new GameBroad(1);
        gameBroad.playersNumberProperty().addListener((v, oldValue, newValue)->{

        });

    }



    @FXML
    public void numberFourButton(ActionEvent event) throws Exception{
        gameBroad.setPlayersNumber(4);
        numberplayerlabel.textProperty().bind(Bindings.convert(gameBroad.playersNumberProperty())   );
        Parent startRoot = FXMLLoader.load(getClass().getResource("../View/welcome.fxml"));
        Scene startScene = new Scene(startRoot);
        Stage start_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        start_stage.setScene(startScene);
        start_stage.show();
    }








}
