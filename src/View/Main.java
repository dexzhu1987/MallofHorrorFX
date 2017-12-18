package View;
import Controller.GameCharacterWindow;
import Controller.MainController;
import Controller.NumberWindow;
import Controller.YesNoWindow;
import Model.Character.GameCharacter;
import Model.Dice.PairofDice;
import Model.Game.Game;
import Model.Game.GameBroad;
import javafx.application.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.image.Image;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

import java.util.*;

public class Main extends Application{
    final Button startGame = new Button(),howTOPlay = new Button(),
    viewRoomButtonRed = new Button(), viewItemListButtonRed = new Button(), okButtonRed = new Button(),
    viewRoomButtonYellow = new Button(),viewItemListButtonYellow = new Button(),okButtonYellow = new Button(),
    viewRoomButtonBlue = new Button(),viewItemListButtonBlue = new Button(),okButtonBlue = new Button(),
    viewRoomButtonGreen = new Button(), viewItemListButtonGreen = new Button(),okButtonGreen = new Button(),
    viewRoomButtonBrown = new Button(), viewItemListButtonBrown  = new Button(), okButtonBrown = new Button(),
    viewRoomButtonBlack = new Button(), viewItemListButtonBlack = new Button(), okButtonBlack = new Button();;
    List<Scene> playersenes = new ArrayList<>();
    Scene welcomeScene, playerRedScene, playerYellowScene, playerBlueScene, playerGreenScene, playerBrownScene, playerBlackScene;
    Stage mainWindow;
    static int numberOfPlayers;
    final static int WIDTH =800;
    final static int HEIGHT=600;
    final GameBroad gameBroad=new GameBroad(1);
    List<Scene> allPlayerScenes = new ArrayList<>();
    final Label welcome = new Label();
    final static List<Scene> actualPlayerScenes = new ArrayList<>();
    List<Button> allOkButtons = new ArrayList<>();
    final static List<Button> actualOkButton = new ArrayList<>();

    ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        //mainWidow setup
        mainWindow = primaryStage;
        mainWindow.setTitle("Mall of Horror");

        //startgameScene
        List<Integer> numberOfPlayersOptions = new ArrayList<>();
        numberOfPlayersOptions.add(4);
        numberOfPlayersOptions.add(5);
        numberOfPlayersOptions.add(6);

        startGame.setText("Start Game");
        startGame.setOnAction(event -> {
            gameBroad.setPlayersNumber(NumberWindow.display(numberOfPlayersOptions, "please select how many players"));
            welcomeScene();
            welcome.setText("Welcome  players " + gameBroad.getPlayersNumber() );
            for (int i=0; i<gameBroad.getPlayersNumber(); i++){
                actualPlayerScenes.add(allPlayerScenes.get(i));
                actualOkButton.add(allOkButtons.get(i));
            }
        });

        howTOPlay.setText("How to Play");

        VBox firstlayout = new VBox();
        firstlayout.getChildren().addAll(startGame, howTOPlay);
        Scene firstscene = new Scene(firstlayout, WIDTH, HEIGHT);
        primaryStage.setScene(firstscene);
        mainWindow.show();

        Button ok1 = new Button("OK");
        ok1.setOnAction(event -> {
           playerselectRoom();
        });
        VBox welcomePlayerslayout = new VBox();
        welcomePlayerslayout.getChildren().addAll(welcome,ok1);
        welcomeScene = new Scene(welcomePlayerslayout, WIDTH, HEIGHT);

        //playersSceneRedSetUp;
        viewRoomButtonRed.setText("Red - Rooms");
        viewItemListButtonRed.setText("Items");
        okButtonRed.setText("Ok");
        VBox playerRedLayout = new VBox();
        playerRedLayout.getChildren().addAll(viewRoomButtonRed,viewItemListButtonRed,okButtonRed);
        playerRedScene = new Scene(playerRedLayout, 800,600);


        //playersSceneYellowSetUp;
        viewRoomButtonYellow.setText("Yellow - Rooms");
        viewItemListButtonYellow.setText("Items");
        okButtonYellow.setText("Ok");
        VBox playerYellowLayout = new VBox();
        playerYellowLayout.getChildren().addAll(viewRoomButtonYellow,viewItemListButtonYellow,okButtonYellow);
        playerYellowScene = new Scene(playerYellowLayout, 800,600);

        //playersSceneBlueSetUp;
        viewRoomButtonBlue.setText("Blue - Rooms");
        viewItemListButtonBlue.setText("Items");
        okButtonBlue.setText("Ok");

        VBox playerBlueLayout = new VBox();
        playerBlueLayout.getChildren().addAll(viewRoomButtonBlue,viewItemListButtonBlue,okButtonBlue);
        playerBlueScene = new Scene(playerBlueLayout, 800,600);

        //playersSceneGreenSetUp;
        viewRoomButtonGreen.setText("Green - Rooms");
        viewItemListButtonGreen.setText("Items");
        okButtonGreen.setText("Ok");
        VBox playerGreenLayout = new VBox();
        playerGreenLayout.getChildren().addAll(viewRoomButtonGreen,viewItemListButtonGreen,okButtonGreen);
        playerGreenScene = new Scene(playerGreenLayout, 800,600);

        viewItemListButtonBrown.setText("Brown - Rooms");
        viewItemListButtonBrown.setText("Items");
        okButtonBrown.setText("Ok");
        VBox playerBrownLayout = new VBox();
        playerBrownLayout.getChildren().addAll(viewRoomButtonBrown,viewItemListButtonBrown,okButtonBrown);
        playerBrownScene = new Scene(playerBrownLayout, 800,600);

        viewItemListButtonBlack.setText("Black - Rooms");
        viewItemListButtonBlack.setText("Items");
        okButtonBlack.setText("Ok");
        VBox playerBlackLayout = new VBox();
        playerBlackLayout.getChildren().addAll(viewRoomButtonBlack,viewItemListButtonBlack,okButtonBlack);
        playerBlackScene = new Scene(playerBlackLayout, 800,600);


        allPlayerScenes.add(playerRedScene);
        allPlayerScenes.add(playerYellowScene);
        allPlayerScenes.add(playerBlueScene);
        allPlayerScenes.add(playerGreenScene);
        allPlayerScenes.add(playerBrownScene);
        allPlayerScenes.add(playerBlackScene);

        allOkButtons.add(okButtonRed);
        allOkButtons.add(okButtonYellow);
        allOkButtons.add(okButtonBlue);
        allOkButtons.add(okButtonGreen);
        allOkButtons.add(okButtonBrown);
        allOkButtons.add(okButtonBlack);





    }

    public void welcomeScene(){
        mainWindow.setScene(welcomeScene);
    }

    public void playerselectRoom(){
        mainWindow.setScene(playerRedScene);
        availableRoomSelect();

    }

    public void availableRoomSelect(){
        for (int i = 0; i < gameBroad.totalCharatersRemain(); i += 4) {
            for (int q = 0; q < gameBroad.getPlayers().size(); q++) {
                PairofDice pairofDice = new PairofDice();
                pairofDice.rollDieOne();
                pairofDice.rollDieTwo();
                List<Integer> dices = new ArrayList<>();
                dices.add(pairofDice.getDieOneFace());
                dices.add(pairofDice.getDieTwoFace());
                List<GameCharacter> characterOpitons = new ArrayList<>();
                int selectedRoom = 0;
                boolean yes = true;
                do {
                    selectedRoom = NumberWindow.display(dices, gameBroad.getPlayers().get(q) + " get " + pairofDice.getDieOneFace() + " and "
                            + pairofDice.getDieTwoFace() + " please select your which room you want to go to");
                    if (gameBroad.matchRoom(selectedRoom).isFull()){
                         yes = YesNoWindow.display(gameBroad.matchRoom(selectedRoom).getName() +
                                " is Full, are you sure? (Your character will be asigned to Parking instead)(choose y/n)");
                    }
                }
                while (!yes);
                for (int k= 0; k< gameBroad.getPlayers().get(q).getCharactersselect().size();k++){
                    characterOpitons.add(gameBroad.getPlayers().get(q).getCharactersselect().get(k));
                }
                String selectedCharacter = GameCharacterWindow.display(characterOpitons, "please select one of these characters into that room");
                if (gameBroad.matchRoom(selectedRoom).isFull()){
                    gameBroad.matchRoom(4).enter(gameBroad.getPlayers().get(q).selectchoose(selectedCharacter));
                    gameBroad.getPlayers().get(q).selectchooseremove(selectedCharacter);
                }
                else{
                    gameBroad.matchRoom(selectedRoom).enter(gameBroad.getPlayers().get(q).selectchoose(selectedCharacter));     ;
                    gameBroad.getPlayers().get(q).selectchooseremove(selectedCharacter);
                }
            }
        }
    }


    public void playerOkButtonSetup(){

    }



}

