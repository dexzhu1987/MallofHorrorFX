package View;
import Controller.NumberWindow;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.util.*;

public class Main extends Application{
    Button startGame,howTOPlay, viewRoomButton, viewItemListButton;
    List<Scene> playersenes = new ArrayList<>();
    Scene welcomeScene, playerRedScene, playerYellowScene, playerBlueScene, playerGreenScene, playerBrownScene, playerBlackScene;
    Stage mainWindow;
    int numberOfPlayers;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{


        //mainWidow setup
        mainWindow = primaryStage;
        mainWindow.setTitle("Mall of Horror");

        //startgameScene
        List<Integer> numberOfPlayersOptions = new ArrayList<>();
        numberOfPlayersOptions.add(4);
        numberOfPlayersOptions.add(5);
        numberOfPlayersOptions.add(6);


        startGame = new Button();
        startGame.setText("Start Game");
        startGame.setOnAction(event -> {
            numberOfPlayers = NumberWindow.display(numberOfPlayersOptions);
            mainWindow.setScene(welcomeScene);
        });


        howTOPlay = new Button();
        howTOPlay.setText("How to Play");

        BorderPane firstlayout = new BorderPane();
        firstlayout.getChildren().addAll(startGame, howTOPlay);
        Scene firstscene = new Scene(firstlayout, 800, 600);
        primaryStage.setScene(firstscene);
        primaryStage.show();


        //welcomehowManyPlayerScene;

        BorderPane welcomePlayerslayout = new BorderPane();
        welcomePlayerslayout.getChildren().addAll();
        Scene welcomePlayers = new Scene(firstlayout, 800, 600);






        //playerRedScene;
        viewRoomButton = new Button();
        viewRoomButton.setText("Rooms");

        viewItemListButton = new Button();
        viewItemListButton.setText("Items");

        BorderPane playerRedLayout = new BorderPane();
        playerRedLayout.getChildren().addAll(viewRoomButton,viewItemListButton);










        Scene playerRedScene;






    }



}

