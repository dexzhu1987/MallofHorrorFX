package View;
import Controller.*;
import Model.Character.GameCharacter;
import Model.Dice.PairofDice;
import Model.Dice.TwoPairofDice;
import Model.Game.GameBroad;
import Model.Item.Item;
import Model.Playable.Playable;
import Model.Room.Room;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import java.net.URL;
import java.util.*;

import static Model.Game.Game.characterCorrectSelectForCertianList;

public class Main extends Application {
    final Button startGame = new Button(), howTOPlay = new Button(),
            viewRoomButtonRed = new Button(), viewItemListButtonRed = new Button(), okButtonRed = new Button(),
            viewRoomButtonYellow = new Button(), viewItemListButtonYellow = new Button(), okButtonYellow = new Button(),
            viewRoomButtonBlue = new Button(), viewItemListButtonBlue = new Button(), okButtonBlue = new Button(),
            viewRoomButtonGreen = new Button(), viewItemListButtonGreen = new Button(), okButtonGreen = new Button(),
            viewRoomButtonBrown = new Button(), viewItemListButtonBrown = new Button(), okButtonBrown = new Button(),
            viewRoomButtonBlack = new Button(), viewItemListButtonBlack = new Button(), okButtonBlack = new Button();
    List<Scene> playersenes = new ArrayList<>();
    Scene welcomeScene, playerRedScene, playerYellowScene, playerBlueScene, playerGreenScene, playerBrownScene, playerBlackScene,
            getStartItemScene, parkingSearchScene, chiefSelectScene, movingScene, zombieAttackScene,fallenRoomScene ,winnerScene;
    Stage mainWindow;
    static int numberOfPlayers;
    final static int WIDTH = 1200;
    final static int HEIGHT = 800;
    final GameBroad gameBroad = new GameBroad(0);
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
            gameBroad.setPlayersNumber(numberWindow.display(numberOfPlayersOptions, "please select how many players"));
            welcomeScene();
            welcome.setText("Welcome  players " + gameBroad.getPlayersNumber());
            for (int i = 0; i < gameBroad.getPlayersNumber(); i++) {
                actualPlayerScenes.add(allPlayerScenes.get(i));
                actualOkButton.add(allOkButtons.get(i));
            }
        });

        howTOPlay.setText("How to Play");
        howTOPlay.setOnAction(event -> {
            openRule();
        });

//        VBox firstlayout = new VBox();
//        firstlayout.setAlignment(Pos.CENTER);
//        firstlayout.getChildren().addAll(startGame, howTOPlay);
//        Scene firstscene = new Scene(firstlayout, WIDTH, HEIGHT);
//        primaryStage.setScene(firstscene);
//        mainWindow.show();

        GridPane firstlayout = new GridPane();
        Image bgimg = new Image("Images/zombie-background.jpg", WIDTH,HEIGHT,false,false);
        GridPane.setRowIndex(startGame, 1);
        GridPane.setRowIndex(howTOPlay, 2);
        firstlayout.setHgap(5);
        firstlayout.setVgap(5);
        firstlayout.setBackground(new Background(new BackgroundImage(bgimg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
        firstlayout.setAlignment(Pos.CENTER);
        howTOPlay.setLayoutY(200);
        Scene firstscene = new Scene(firstlayout,WIDTH, HEIGHT);
        firstlayout.getChildren().addAll(startGame, howTOPlay);
        primaryStage.setScene(firstscene);
        primaryStage.show();

        Button ok1 = new Button("OK");
        ok1.setOnAction(event -> {
            playerselectRoom();
        });

        VBox welcomePlayerslayout = new VBox();
        welcomePlayerslayout.setAlignment(Pos.CENTER);
        welcomePlayerslayout.getChildren().addAll(welcome, ok1);
        welcomeScene = new Scene(welcomePlayerslayout, WIDTH, HEIGHT);


        //playersSceneRedSetUp;
        viewRoomButtonRed.setText("Red - Rooms");
        viewRoomButtonRed.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonRed.setText("Items");
        viewItemListButtonRed.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[0]);
        });
        okButtonRed.setText("Ok");
        VBox playerRedLayout = new VBox();
        playerRedLayout.getChildren().addAll(viewRoomButtonRed, viewItemListButtonRed, okButtonRed);
        playerRedScene = new Scene(playerRedLayout, 800, 600);


        //playersSceneYellowSetUp;
        viewRoomButtonYellow.setText("Yellow - Rooms");
        viewRoomButtonYellow.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonYellow.setText("Items");
        viewItemListButtonYellow.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[1]);
        });
        okButtonYellow.setText("Ok");
        VBox playerYellowLayout = new VBox();
        playerYellowLayout.getChildren().addAll(viewRoomButtonYellow, viewItemListButtonYellow, okButtonYellow);
        playerYellowScene = new Scene(playerYellowLayout, 800, 600);

        //playersSceneBlueSetUp;
        viewRoomButtonBlue.setText("Blue - Rooms");
        viewRoomButtonBlue.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonBlue.setText("Items");
        viewItemListButtonBlue.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[2]);
        });
        okButtonBlue.setText("Ok");
        VBox playerBlueLayout = new VBox();
        playerBlueLayout.getChildren().addAll(viewRoomButtonBlue, viewItemListButtonBlue, okButtonBlue);
        playerBlueScene = new Scene(playerBlueLayout, 800, 600);

        //playersSceneGreenSetUp;
        viewRoomButtonGreen.setText("Green - Rooms");
        viewRoomButtonGreen.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonGreen.setText("Items");
        viewItemListButtonGreen.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[3]);
        });
        okButtonGreen.setText("Ok");
        VBox playerGreenLayout = new VBox();
        playerGreenLayout.getChildren().addAll(viewRoomButtonGreen, viewItemListButtonGreen, okButtonGreen);
        playerGreenScene = new Scene(playerGreenLayout, 800, 600);

        //playersSceneBrownSetUp;
        viewRoomButtonBrown.setText("Brown - Rooms");
        viewRoomButtonBrown.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonBrown.setText("Items");
        viewItemListButtonBrown.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[4]);
        });
        okButtonBrown.setText("Ok");
        VBox playerBrownLayout = new VBox();
        playerBrownLayout.getChildren().addAll(viewRoomButtonBrown, viewItemListButtonBrown, okButtonBrown);
        playerBrownScene = new Scene(playerBrownLayout, 800, 600);


        //playersSceneBlackSetUp;
        viewRoomButtonBlack.setText("Black - Rooms");
        viewRoomButtonBlack.setOnAction(event -> {
            viewRooms();
        });
        viewItemListButtonBlack.setText("Items");
        viewItemListButtonBlack.setOnAction(event -> {
            viewItem(gameBroad.getTotalPlayerslist()[5]);
        });
        okButtonBlack.setText("Ok");
        VBox playerBlackLayout = new VBox();
        playerBlackLayout.getChildren().addAll(viewRoomButtonBlack, viewItemListButtonBlack, okButtonBlack);
        playerBlackScene = new Scene(playerBlackLayout, 800, 600);


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

        //getStarterItemScene;
        Label starterItemLabel = new Label();
        starterItemLabel.setText("Each player gonna have one starter Item, and the information should be kept to the player himself/herself, please click Ok to proceed");
        Button ok2 = new Button();
        ok2.setText("OK");
        ok2.setOnAction(event -> {
            eachplayerGetStarterItem();
        });
        VBox starterItemLayout = new VBox();
        starterItemLayout.getChildren().addAll(starterItemLabel, ok2);
        getStartItemScene = new Scene(starterItemLayout, WIDTH, HEIGHT);

        //ParkingSearchScene;
        Label parkingSeachLabel = new Label();
        parkingSeachLabel.setText("Welcome to a new round." +
                "\nWe will proceed parking seach first, " +
                "\nplayers that in ROOM No.4 parking will vote to decide who do the searching, " +
                "\nThe winner will search around the parking and will find" +
                " three items, " +
                "\nhe/she will be able to keep one item, and give one item to the other player, and return one back to the Parking. " +
                "\n(Note: if the vote result in TIE, no searching will perform) " +
                "\nIf you understand, please click Ok to proceed.");
        Button viewRoomParking = new Button();
        viewRoomParking.setText("Room");
        viewRoomParking.setOnAction(event -> {
            viewRooms();
        });
        Button ok3 = new Button();
        ok3.setText("OK");
        ok3.setOnAction(event -> {
            searchStart();
        });
        VBox parkingSeachLayout = new VBox();
        parkingSeachLayout.getChildren().addAll(parkingSeachLabel,viewRoomParking, ok3);
        parkingSearchScene = new Scene(parkingSeachLayout, WIDTH, HEIGHT);


        //ChiefSelectScene
        Label chiefSelectLabel = new Label();
        chiefSelectLabel.setText("Now we proceed to chief selection, players that in ROOM No.5 SecurityHQ will vote to decide who will be the chief, The chief will be able to look at the cameras and " +
                "find out where the zombies are coming (only chief has this information." +
                "\n(Note: if the vote result in TIE, no chief will be elected) " +
                "\nIf you understand, please click Ok to proceed.");
        Button viewRoomButtonChief = new Button();
        viewRoomButtonChief.setText("Room");
        viewRoomButtonChief.setOnAction(event -> {
            viewRooms();
        });
        Button ok4 = new Button();
        ok4.setText("OK");
        ok4.setOnAction(event -> {
            chiefSelect();
        });
        VBox chiefSelectLayout = new VBox();
        chiefSelectLayout.getChildren().addAll(chiefSelectLabel,viewRoomButtonChief, ok4);
        chiefSelectScene = new Scene(chiefSelectLayout, WIDTH,HEIGHT);

        //ChracterMovingScene
        Label movingLabel = new Label();
        movingLabel.setText("The chief will at the result now. If no chief is eleced, a ramdom player will start the turn first");
        Button viewRoomMoving = new Button();
        viewRoomMoving.setText("Room");
        viewRoomMoving.setOnAction(event -> {
            viewRooms();
        });
        Button ok5 = new Button();
        ok5.setText("OK");
        VBox movingLayout = new VBox();
        movingLayout.getChildren().addAll(movingLabel,viewRoomMoving, ok5);
        movingScene = new Scene(movingLayout,WIDTH,HEIGHT);

        //ZombieAttackScene
        Label zombieAttackLabel = new Label();
        zombieAttackLabel.setText("Now we will reveal where the zomies will go to ");
        Button viewRoomAttack = new Button();
        viewRoomAttack.setText("Room");
        viewRoomAttack.setOnAction(event -> {
            viewRooms();
        });
        Button ok6 = new Button();
        ok6.setText("OK");
        VBox zombieAttackLayout = new VBox();
        zombieAttackLayout.getChildren().addAll(zombieAttackLabel,viewRoomAttack, ok6);
        zombieAttackScene = new Scene(zombieAttackLayout,WIDTH,HEIGHT);


        //fallenRoomScene
        Label fallenRoomLabel =  new Label();
        fallenRoomLabel.setText("--------------------Zombies attacked ----------------------"+
                "\nFor each room, when characters' strength is less than zombies number, zombies attacked successfully." +
                "\nIf zombies attacked successfully, one character will be eaten by the zombies"+
                "\nNote: Parking has no defends, so as long as there is zombies there, one character will be eaten(and no item except thread is allowed)"+
                "\nNote: Supermarket has too many entraces (weak defends), so as long as there are more than four zombies there, one character will be eaten (less than four: the same rule as the other room"+
        "\nIf you have understood, please type OK to move to the next step");
        Button viewRoomFallen = new Button();
        viewRoomFallen.setText("Room");
        viewRoomFallen.setOnAction(event -> {
            viewRooms();
        });
        Button ok7 = new Button("OK");
        ok7.setOnAction(event -> {
            zombieAttacked();
        });
        VBox fallenRoomLayout = new VBox();
        fallenRoomLayout.getChildren().addAll(fallenRoomLabel,viewRoomFallen, ok7);
        fallenRoomScene = new Scene(fallenRoomLayout,WIDTH,HEIGHT);


        Label winner = new Label();
        winner.setText("After a long ... we have only four survivor in the mall"+
        "\nClick Ok to find out who's the winner");
        Button viewRoomWinner = new Button("Room");
        viewRoomWinner.setOnAction(event -> {
            viewRooms();
        });
        Button ok8 = new Button("OK");
        ok8.setOnAction(event -> {
            whosTheWinner();
        });
        VBox winnerLayout = new VBox();
        winnerLayout.getChildren().addAll(winner, ok8);
        winnerScene = new Scene(winnerLayout, WIDTH,HEIGHT);

    }

    public void openRule(){
        Stage Window = new Stage();
        Image ruleImg = new Image("Images/Rule.jpg", 1200, 2300, false, false);

        StackPane layout = new StackPane();
        ScrollPane scroll = new ScrollPane();
        layout.setAlignment(Pos.CENTER);
        scroll.setContent(new ImageView(ruleImg));
        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        Scene rule = new Scene(layout, 1200, 750);
        layout.getChildren().addAll(scroll);
        Window.setScene(rule);
        Window.show();
    }

    public void welcomeScene() {
        mainWindow.setScene(welcomeScene);
    }

    public void playerselectRoom() {
        mainWindow.setScene(playerRedScene);
        availableRoomSelect();
    }

    public void viewRooms(){
          RoomView.display(gameBroad.getRooms());

//        List<String> rooms = new ArrayList<>();
//        for (int i=0; i<gameBroad.getRooms().size(); i++){
//            rooms.add(gameBroad.getRooms().get(i).toString());
//        }
//        MultiMessagesWindow.display(rooms, "Room Current Status");
    }

    public void viewItem(Playable player){
       String itemList = player.getCurrentItem().toString();
       SimpleMessageWindow.display("You have below Items:" +
               "\n" + itemList);
    }

    public void availableRoomSelect() {
        for (int i = 0; i < gameBroad.totalCharatersRemain(); i += gameBroad.getPlayersNumber()) {
            for (int q = 0; q < gameBroad.getPlayers().size(); q++) {
                mainWindow.setScene(actualPlayerScenes.get(q));
                PairofDice pairofDice = new PairofDice();
                pairofDice.rollDieOne();
                pairofDice.rollDieTwo();
                List<Integer> dices = new ArrayList<>();
                dices.add(pairofDice.getDieOneFace());
                dices.add(pairofDice.getDieTwoFace());
                List<GameCharacter> characterOpitons = new ArrayList<>();
                int selectedRoom = 0;
                boolean yes;
                do {
                    yes = true;
                    selectedRoom = numberWindow.display(dices, gameBroad.getPlayers().get(q) + " get " + pairofDice.getDieOneFace() + " and "
                            + pairofDice.getDieTwoFace() + " please select your which room you want to go to");
                    if (gameBroad.matchRoom(selectedRoom).isFull()) {
                        yes = YesNoWindow.display(gameBroad.matchRoom(selectedRoom).getName() +
                                " is Full, are you sure? (Your character will be asigned to Parking instead)");
                    }
                }
                while (!yes);

                for (int k = 0; k < gameBroad.getPlayers().get(q).getCharactersselect().size(); k++) {
                    characterOpitons.add(gameBroad.getPlayers().get(q).getCharactersselect().get(k));
                }
                String selectedCharacter = GameCharacterWindow.display(characterOpitons, gameBroad.getPlayers().get(q) +
                        "please select one of these characters into " + ((gameBroad.matchRoom(selectedRoom).isFull())? "Parking":gameBroad.matchRoom(selectedRoom).getName()));
                if (gameBroad.matchRoom(selectedRoom).isFull()) {
                    gameBroad.matchRoom(4).enter(gameBroad.getPlayers().get(q).selectchoose(selectedCharacter));
                    gameBroad.getPlayers().get(q).selectchooseremove(selectedCharacter);
                } else {
                    gameBroad.matchRoom(selectedRoom).enter(gameBroad.getPlayers().get(q).selectchoose(selectedCharacter));
                    ;
                    gameBroad.getPlayers().get(q).selectchooseremove(selectedCharacter);
                }

            }
        }
        mainWindow.setScene(getStartItemScene);
    }


    public void eachplayerGetStarterItem() {
        gameBroad.getItemDeck().shuffle();
        for (int i = 0; i < gameBroad.getPlayers().size(); i++) {
            mainWindow.setScene(actualPlayerScenes.get(i));
            SimpleMessageWindow.display(gameBroad.getPlayers().get(i) + " have received an starter item, please click Ok to see it (Keep it to yourself)");
            Item starterItem = gameBroad.getItemDeck().deal();
            gameBroad.getPlayers().get(i).getItem(starterItem);
            SimpleMessageWindow.display("You have received " + starterItem + ". It has been received added to your item list");
        }
        mainWindow.setScene(parkingSearchScene);
    }

    public void searchStart() {
        if (gameBroad.matchRoom(4).isEmpty() || gameBroad.getItemDeck().getItemsDeck().size() < 3) {
            SimpleMessageWindow.display("Due to Parking is empty (or no more item avaiable), no searching will be performed");
        } else {
            //voting begins
            HashSet<Playable> searchteam = gameBroad.WhoCan(gameBroad.matchRoom(4).existCharacterColor());
            List<Playable> searchTeam = new ArrayList<>();
            for (Playable player : searchteam) {
                searchTeam.add(player);
            }
            SimpleMessageWindow.display(searchteam + " please vote who can search");
            List<Scene> playersScenes = matchThePlayerScenes(searchTeam);
            List<String> votes = new ArrayList<>();
            String vote = "";
            for (int i = 0; i < searchteam.size(); i++) {
                mainWindow.setScene(playersScenes.get(i));
                Playable teammember = searchTeam.get(i);
                vote = ChoosingColorWindow.display(searchTeam, teammember + " please vote color in the list:" + searchteam);
                votes.add(teammember.getColor());
                votes.add(vote);
            }
            gameBroad.matchRoom(4).resetVoteResult();
            gameBroad.matchRoom(4).voteResultAfterVote(votes);
            List<String> results = new ArrayList<>();
            for (int l = 0; l < votes.size(); l += 2) {
                results.add(gameBroad.matchPlayer(votes.get(l)) + " has voted " + votes.get(l + 1));
            }
            results.add("Summary: " + gameBroad.matchRoom(4).getCurrentVoteResult());
            MultiMessagesWindow.display(results, "Voting Result");
            //using Threat to change result;
            if (teamHasThreat(searchteam)) {
                boolean voteYes = YesNoWindow.display("Voting result can be changed by item THREAT, anyone want to change the result?");
                if (voteYes) {
                    boolean moreThreatused ;
                    do {
                        moreThreatused =false;
                        int numThreat = 0;
                        for (int i=0; i<searchTeam.size();i++) {
                            mainWindow.setScene(playersScenes.get(i));
                            Playable teammember = searchTeam.get(i);
                            List<Integer> threadOptions = new ArrayList<>();
                            for (int q=0; q<=teammember.threatNum(); q++){
                                threadOptions.add(q);
                            }
                            numThreat = numberWindow.display(threadOptions,teammember + " please select how many THREAT you want use?" );
                            String effectedColor = "";
                            for (int q = 0; q < votes.size(); q += 2) {
                                if (teammember.getColor().equalsIgnoreCase(votes.get(q))) {
                                    effectedColor = votes.get(q + 1);
                                }
                            }
                            effectedColor = effectedColor.toUpperCase();
                            gameBroad.matchRoom(4).voteResultAfterItem(effectedColor, numThreat);
                            for (int q = 0; q < numThreat; q++) {
                                Item threat = gameBroad.matchItem(teammember, "Threat");
                                teammember.usedItem(threat);
                            }
                        }
                        SimpleMessageWindow.display("Result after the THREAT used: " + gameBroad.matchRoom(4).getCurrentVoteResult());
                        moreThreatused = YesNoWindow.display("Please confirm no more THREAT will be used (y - there will be more THREAT/n - no more THREAT)");
                    }
                    while (moreThreatused);
                }
            }
            //result print
            if (gameBroad.matchRoom(4).winner().equals("TIE")) {
                SimpleMessageWindow.display("Result is TIE. " + " No Searching will be performed");
            } else {
                //searching begins
                mainWindow.setScene(parkingSearchScene);
                String winnercolor = gameBroad.matchRoom(4).winner();
                SimpleMessageWindow.display("Winner is " + gameBroad.matchPlayer(winnercolor));
                SimpleMessageWindow.display(gameBroad.matchPlayer(winnercolor) + " searched the parking and " +
                            "found below items(only winning player can see the result and arrange items),please type OK to move to next step)");
                gameBroad.getItemDeck().shuffle();
                Item item1 = gameBroad.getItemDeck().deal();
                Item item2 = gameBroad.getItemDeck().deal();
                Item item3 = gameBroad.getItemDeck().deal();
                List<Item> itemtemplist = new ArrayList<>();
                itemtemplist.add(item1);
                itemtemplist.add(item2);
                itemtemplist.add(item3);
                List<Integer> options = new ArrayList<>();
                options.add(1);
                options.add(2);
                options.add(3);
                int itemselect = numberWindow.display(options, "You get 1." + itemtemplist.get(0) + ", 2." + itemtemplist.get(1) + " and 3." +
                        itemtemplist.get(2) + ". Please select the item you want to keep (1,2,or 3)");
                SimpleMessageWindow.display("You get " + itemtemplist.get(itemselect - 1));
                gameBroad.matchPlayer(winnercolor).getItem(itemtemplist.get(itemselect - 1));
                itemtemplist.remove(itemselect - 1);
                options.remove(2);
                int itemgiveselect =numberWindow.display(options,  "Remaining items: " + " 1." + itemtemplist.get(0) + ", 2." + itemtemplist.get(1)
                + ". Please select the item you want to give (1 or 2)");
                HashSet<Playable> others = gameBroad.RemainPlayers(gameBroad.matchPlayer(winnercolor));
                List<Playable> othersList = new ArrayList<>();
                for (Playable other: others){
                    othersList.add(other);
                }
               String givecolor =ChoosingColorWindow.display(othersList, "Please select who you want give in the List: " + others);
                Item giveItem = itemtemplist.get(itemgiveselect - 1);
                gameBroad.matchPlayer(givecolor).getItem(itemtemplist.get(itemgiveselect - 1));
                itemtemplist.remove(itemgiveselect - 1);
                gameBroad.getItemDeck().addBackItem(itemtemplist.get(0));
                String ok1 = "";
                SimpleMessageWindow.display(gameBroad.matchPlayer(givecolor) + " you have received an item from " + gameBroad.matchPlayer(winnercolor)
                    + " Pleaese click OK to view the item (keep it to yourself)");
                SimpleMessageWindow.display("You have received " + giveItem);
                SimpleMessageWindow.display("Other players will be joining the game now, type OK to continue");
                SimpleMessageWindow.display("Player " + givecolor + " get an item from player " + winnercolor);
            }
        }
        mainWindow.setScene(chiefSelectScene);
    }

    public void chiefSelect(){
        int currentVotingRoomNumber = 5;
        if (gameBroad.matchRoom(5).isEmpty() ){
           SimpleMessageWindow.display("Due to SecurityHQ is empty, no chief election will be performed");

        }
        else {
            //voting begins
            HashSet<Playable> team =  gameBroad.WhoCan(gameBroad.matchRoom(currentVotingRoomNumber).existCharacterColor());
            List <Playable> chiefTeam = new ArrayList<>();
            for (Playable player : team) {
                chiefTeam.add(player);
            }
            SimpleMessageWindow.display(chiefTeam + " please vote who will be the chief");
            List<Scene> playersScenes = matchThePlayerScenes(chiefTeam);
            List<String> votes = new ArrayList<>();
            String vote = "";
            for (int i = 0; i < chiefTeam.size(); i++) {
                mainWindow.setScene(playersScenes.get(i));
                Playable teammember = chiefTeam.get(i);
                vote = ChoosingColorWindow.display(chiefTeam, teammember + " please vote color in the list:" + chiefTeam);
                votes.add(teammember.getColor());
                votes.add(vote);
            }
            gameBroad.matchRoom(currentVotingRoomNumber).resetVoteResult();
            gameBroad.matchRoom(currentVotingRoomNumber).voteResultAfterVote(votes);
            List<String> results = new ArrayList<>();
            for (int l = 0; l < votes.size(); l += 2) {
                results.add(gameBroad.matchPlayer(votes.get(l)) + " has voted " + votes.get(l + 1));
            }
            results.add("Summary: " + gameBroad.matchRoom(currentVotingRoomNumber).getCurrentVoteResult());
            MultiMessagesWindow.display(results, "Voting Result");
            //using Threat to change result;
            if (teamHasThreat(team)) {
                boolean voteYes = YesNoWindow.display("Voting result can be changed by item THREAT, anyone want to change the result?");
                if (voteYes) {
                    boolean moreThreatused = false;
                    do {
                        int numThreat = 0;
                        for (int i=0; i<chiefTeam.size();i++) {
                            mainWindow.setScene(playersScenes.get(i));
                            Playable teammember = chiefTeam.get(i);
                            List<Integer> threadOptions = new ArrayList<>();
                            for (int q=0; q<=teammember.threatNum(); q++){
                                threadOptions.add(q);
                            }
                            numThreat = numberWindow.display(threadOptions,teammember + " please select how many THREAT you want use?" );
                            String effectedColor = "";
                            for (int q = 0; q < votes.size(); q += 2) {
                                if (teammember.getColor().equalsIgnoreCase(votes.get(q))) {
                                    effectedColor = votes.get(q + 1);
                                }
                            }
                            effectedColor = effectedColor.toUpperCase();
                            gameBroad.matchRoom(currentVotingRoomNumber).voteResultAfterItem(effectedColor, numThreat);
                            for (int q = 0; q < numThreat; q++) {
                                Item threat = gameBroad.matchItem(teammember, "Threat");
                                teammember.usedItem(threat);
                            }
                        }
                        SimpleMessageWindow.display("Result after the THREAT used: " + gameBroad.matchRoom(currentVotingRoomNumber).getCurrentVoteResult());
                        moreThreatused = YesNoWindow.display("Please confirm no more THREAT will be used (y - there will be more THREAT/n - no more THREAT)");
                    }
                    while (moreThreatused);
                }
            }
        }
        //result print
        if (!gameBroad.matchRoom(5).isEmpty() ) {
            if (gameBroad.matchRoom(5).winner().equals("TIE")) {
                SimpleMessageWindow.display("Result is TIE."+ " No chief is elected");
            }
        }
        else {
            String winnercolor = gameBroad.matchRoom(currentVotingRoomNumber).winner();
            SimpleMessageWindow.display("Voting Result: " + gameBroad.matchRoom(currentVotingRoomNumber).getCurrentVoteResult());
            SimpleMessageWindow.display("Winner is " + gameBroad.matchPlayer(winnercolor));
        }
        //
        mainWindow.setScene(movingScene);
        //------------------------Room selecting begins-------------------------------
        TwoPairofDice fourdices = new TwoPairofDice();
        int DiceOne = fourdices.rollDieOne();
        int DiceTwo = fourdices.rollDieTwo();
        int DiceThree = fourdices.rollDieThree();
        int DiceFour = fourdices.rollDieFour();
        List<Integer> dices = new ArrayList<>();
        dices.add(DiceOne);
        dices.add(DiceTwo);
        dices.add(DiceThree);
        dices.add(DiceFour);
        int startplayer = 0;
        int startplayerroomnumber = 0;
        if (gameBroad.matchRoom(5).winner().equals("TIE") || gameBroad.matchRoom(5).isEmpty() ){
            Random generator = new Random();
            startplayer = generator.nextInt(gameBroad.getPlayers().size());
            SimpleMessageWindow.display("As a result, a random player will start first.");
            Playable startActPlayer = gameBroad.getPlayers().get(startplayer);
            mainWindow.setScene(actualPlayerScenes.get(startplayer));
            if (startActPlayer.hasSecurityCamera()) {
                boolean usedCamera = YesNoWindow.display("The results can be viewed by using item SecurityCamera, you want to use Security Camera?(y/n)");
                if (usedCamera) {
                    List<String> messages = new ArrayList<>();
                    messages.add(dices.toString());
                    messages.add("Each number means the correspoding room will have one zombie");
                    MultiMessagesWindow.display(messages, "Zombies will be approaching:");
                }
            }
            List <Integer> options = new ArrayList<>();
            options.add(1);
            options.add(2);
            options.add(3);
            options.add(4);
            options.add(5);
            options.add(6);
            startplayerroomnumber = numberWindow.display(options,startActPlayer + " please choose your room number");
        } else {
            String winnercolor = gameBroad.matchRoom(currentVotingRoomNumber).winner();
            startplayer = gameBroad.getPlayers().indexOf(gameBroad.matchPlayer(winnercolor));
            SimpleMessageWindow.display(gameBroad.matchPlayer(winnercolor) + " looked at the screens " +
                        "found zombies are approaching to rooms(only winning player can see the result),please click OK to move to next step)");
            List<String> messages = new ArrayList<>();
            messages.add(dices.toString());
            messages.add("If you have remember the results, please type OK to continue");
            MultiMessagesWindow.display(messages,"Each number means the correspoding room will have one zombie");
            mainWindow.setScene(actualPlayerScenes.get(startplayer));
            List <Integer> options = new ArrayList<>();
            options.add(1);
            options.add(2);
            options.add(3);
            options.add(4);
            options.add(5);
            options.add(6);
            startplayerroomnumber = numberWindow.display(options,"Please choose the room number that you will go to" );
            SimpleMessageWindow.display("After reviewing the monitor, the chief will go to Room " + startplayerroomnumber);
        }
        if (teamHasSecurityCamera(gameBroad.getPlayers())) {
           boolean usedCameraTeam = YesNoWindow.display("The results can be viewed by using item SecurityCamera, anyone want to use Security Camera?(y/n)");
            if (usedCameraTeam) {
                for (int i=0; i<gameBroad.getPlayers().size(); i++) {
                    Playable player = gameBroad.getPlayers().get(i);
                    mainWindow.setScene(actualPlayerScenes.get(i));
                    boolean usedCamera = YesNoWindow.display(player + " please confirm you want to use your SecurityCamera Item to view the result(y/n)");
                    if (usedCamera) {
                        if (player.hasSecurityCamera()) {
                            List<String> messages = new ArrayList<>();
                            messages.add(dices.toString());
                            messages.add("Each number means the correspoding room will have one zombie");
                            MultiMessagesWindow.display(messages, "Zombies will be approaching:");
                            Item securityCamera = gameBroad.matchItem(player, "SecurityCamera");
                            player.usedItem(securityCamera);
                        } else {
                            SimpleMessageWindow.display("You do not have a Security Camera");
                        }
                    }
                }
            }
        }
        //-------------------------chief select and camera viewing ends------------------------
        //----------------------other 5 player choosing their desination---------------------
        List<Integer> roomspicked = new ArrayList<>();
        //first half of players
        for (int i = startplayer+1; i<gameBroad.getPlayers().size(); i++){
            mainWindow.setScene(actualPlayerScenes.get(i));
            List <Integer> options = new ArrayList<>();
            options.add(1);
            options.add(2);
            options.add(3);
            options.add(4);
            options.add(5);
            options.add(6);
            int roompicked = numberWindow.display(options,gameBroad.getPlayers().get(i) + " please choose your room number");
            roomspicked.add(roompicked);
        }
        //other half players
        for (int i = 0; i<startplayer; i++){
            mainWindow.setScene(actualPlayerScenes.get(i));
            List <Integer> options = new ArrayList<>();
            options.add(1);
            options.add(2);
            options.add(3);
            options.add(4);
            options.add(5);
            options.add(6);
            int roompicked = numberWindow.display(options,gameBroad.getPlayers().get(i) + " please choose your room number");
            roomspicked.add(roompicked);
        }
        SimpleMessageWindow.display("Moving Begins");
        //-------------------------- now players choose character and move to rooms;
        //start player move
        Playable startActualPlayer = gameBroad.getPlayers().get(startplayer);
        Room destination = gameBroad.matchRoom(startplayerroomnumber);
        mainWindow.setScene(actualPlayerScenes.get(startplayer));
        String charselect = GameCharacterWindow.display(characterNotInTheRoom(destination, startActualPlayer), gameBroad.getPlayers().get(startplayer) + " please choose your characters to Room " + startplayerroomnumber + ": " +
                gameBroad.matchRoom(startplayerroomnumber).getName() );
        GameCharacter selectedCharacter = gameBroad.matchGameCharacter(gameBroad.getPlayers().get(startplayer),charselect);
        Room leavingroom = gameBroad.inWhichRoom(selectedCharacter);
        gameBroad.inWhichRoom(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(startplayer),charselect)).leave(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(startplayer),charselect));
        if (gameBroad.matchRoom(startplayerroomnumber).isFull()){
            gameBroad.matchRoom(4).enter(selectedCharacter);
            SimpleMessageWindow.display(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(startplayer),charselect) + " left " +
                    leavingroom.getName() + " and wanted to enter " + gameBroad.matchRoom(startplayerroomnumber).getName()
            +"\nBut due to room is full, character is moved to Parking instead");
        }else {
            gameBroad.matchRoom(startplayerroomnumber).enter(selectedCharacter);
            SimpleMessageWindow.display(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(startplayer),charselect) + " left " +
                    leavingroom.getName() + " enter " + gameBroad.matchRoom(startplayerroomnumber).getName());
        }
        //other players, first half
        int k = 0;
        for (int i = startplayer+1 ,q=0; i<gameBroad.getPlayers().size(); i++,q++){
            Playable actualPlayer = gameBroad.getPlayers().get(i);
            Room destination2 = gameBroad.matchRoom(roomspicked.get(q));
            mainWindow.setScene(actualPlayerScenes.get(i));
            charselect = GameCharacterWindow.display(characterNotInTheRoom(destination2, actualPlayer),actualPlayer + " please choose your characters to Room " + destination2.getName() + ": " +
                    destination2.getName());
            GameCharacter selectedCharacter2 =  gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect);
            Room leavingroom2 = gameBroad.inWhichRoom(selectedCharacter2);
            gameBroad.inWhichRoom(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect)).leave(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect));
            if (gameBroad.matchRoom(roomspicked.get(q)).isFull()){
                gameBroad.matchRoom(4).enter(selectedCharacter2);
                SimpleMessageWindow.display(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect) + " left " +
                        leavingroom2.getName() + " and wanted enter " + gameBroad.matchRoom(roomspicked.get(q)).getName()+
                        "\nBut due to room is full, character is moved to Parking instead");
            }else {
                gameBroad.matchRoom(roomspicked.get(q)).enter(selectedCharacter2);
                SimpleMessageWindow.display(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect) + " left " +
                        leavingroom2.getName() + " enter " + gameBroad.matchRoom(roomspicked.get(q)).getName());
            }
            k++;
        }
        for (int i = 0 ,q=k; i<startplayer; i++,q++){
            Playable actualPlayer2 = gameBroad.getPlayers().get(i);
            Room destination3 = gameBroad.matchRoom(roomspicked.get(q));
            mainWindow.setScene(actualPlayerScenes.get(i));
            charselect = GameCharacterWindow.display(characterNotInTheRoom(destination3, actualPlayer2),actualPlayer2 + " please choose your characters to Room " + destination3.getName() + ": " +
                    destination3.getName() );
            GameCharacter selectedCharacter2 = gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect);
            Room leavingRoom2 = gameBroad.inWhichRoom(selectedCharacter2);
            gameBroad.inWhichRoom(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect)).leave(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect));
            if (gameBroad.matchRoom(roomspicked.get(q)).isFull()){
                gameBroad.matchRoom(4).enter(selectedCharacter2);
                SimpleMessageWindow.display( gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect) + " left " +
                        leavingRoom2.getName() + " and wanted to enter " + gameBroad.matchRoom(roomspicked.get(q)).getName()
                        +"\nDue to room is full, character is moved to Parking instead");
            }else {
                gameBroad.matchRoom(roomspicked.get(q)).enter(selectedCharacter2);
                SimpleMessageWindow.display(gameBroad.matchGameCharacter(gameBroad.getPlayers().get(i),charselect) + " leave " +
                        leavingRoom2.getName() + " enter " + gameBroad.matchRoom(roomspicked.get(q)).getName());
            }
        }
       mainWindow.setScene(zombieAttackScene);
       List<String> messages = new ArrayList<>();
       messages.add("Zombies will be approaching rooms ");
       messages.add("Dices result" + dices);
       messages.add("Each number means the correspoding room will have one zombie");
       messages.add("As a result, zomebie are entering");
        for (int dice: dices){
            gameBroad.matchRoom(dice).zombieApproached();
            messages.add("A zombie has approached " + gameBroad.matchRoom(dice).getName() );
        }
        MultiMessagesWindow.display(messages,"Now we will reveal where the zomies will go to");

        List<String> messages2 = new ArrayList<>();
        messages2.add("For the room with most people, one more zombie will attracted to there (they can smell the flesh)");
        if (gameBroad.mostPeople().getRoomNum()==7){
            messages2.add("Result is TIE, no zombie will be attacted");
        }
        else {
            gameBroad.mostPeople().zombieApproached();
            messages2.add("As a result, one zombie has approached " + gameBroad.mostPeople().getName());
        }
        messages2.add("---------------------------------------------------------------------------------------------------------");
        messages2.add("For the room with most models (they are more likely to scream), one more zombie will attracted to there");
        if (gameBroad.mostModel().getRoomNum()==7){
            messages2.add("Result is TIE, no zombie will be attacted");
        }
        else {
            gameBroad.mostModel().zombieApproached();
            messages2.add("As a result, one zombie has approached " + gameBroad.mostModel().getName());
        }
        MultiMessagesWindow.display(messages2, "We may have more zombies approached due to below reasons");
        mainWindow.setScene(fallenRoomScene);
    }


    public void zombieAttacked() {
        int count = 0;
        for (int i = 0; i < gameBroad.getRooms().size(); i++) {
            if (gameBroad.getRooms().get(i).isFallen()) {
                count++;
                List<Item> usedItemsList = new ArrayList<>();
                Room fallenRoom = gameBroad.getRooms().get(i);
                HashSet<Playable> playersInTheRoom = gameBroad.WhoCan(fallenRoom.existCharacterColor());
                List<Playable> playersInTheRoomList = new ArrayList<>();
                for (Playable player : playersInTheRoom) {
                    playersInTheRoomList.add(player);
                }
                List<Scene> playerScenes = matchThePlayerScenes(playersInTheRoomList);
                SimpleMessageWindow.display(fallenRoom.getName() + " has fallen, one character will be eaten");
                //using items to save the room
                if (teamHasOtherItems(playersInTheRoom) && fallenRoom.getRoomNum() != 4) {
                    boolean usedItemTeam = YesNoWindow.display("This result can change by using below items, anyone in the room want to use Items?(y/n)" +
                            "\n---------------------------------------------------------------" +
                            "\nAxe: kill one zombie" +
                            "\nShortGun: kill two zombies" +
                            "\nHardware: add one defend for a turn" +
                            "\nSprint: escape to the other room" +
                            "\nHidden: your character will not be killed nor can joined the voting" +
                            "\n---------------------------------------------------------------");
                    if (usedItemTeam) {
                        boolean noMore;
                        do {
                            noMore = true;
                            for (int q = 0; q < playersInTheRoomList.size(); q++) {
                                Playable player = playersInTheRoomList.get(q);
                                mainWindow.setScene(playerScenes.get(q));
                                if (player.hasOthersItems()) {
                                    int itemselected = 0;
                                    boolean usedItemBoolean = YesNoWindow.display(player + " please confirm you want to use item.");
                                    if (usedItemBoolean) {
                                        List<Integer> options = new ArrayList<>();
                                        for (int k = 1; k <= player.otherItemsList().size(); k++) {
                                            options.add(k);
                                        }
                                        itemselected = numberWindow.display(options, player + " please select which items you want to use:" +
                                                "\nYour item list: " + printTheListWithNumber(player.otherItemsList())
                                                + "\nPlease select in (" + printTheOptions(player.otherItemsList()) + ")");
                                        Item usedItem = player.otherItemsList().get(itemselected - 1);
                                        usedItemsList.add(usedItem);
                                        usedItem.effect(player, fallenRoom);
                                        player.usedItem(usedItem);
                                    }
                                }
                            }
                            mainWindow.setScene(zombieAttackScene);
                            noMore = YesNoWindow.display("Please confirmed no more items will be used (y - no more item will be used/n - more item will be used)");
                        }
                        while (!noMore);
                    }
                }
                // items using ended
                if (fallenRoom.isFallen()) {
                    HashSet<Playable> newPlayersInTheRoom = gameBroad.WhoCan(fallenRoom.existCharacterColor());
                    List<Playable> newPlayersInTheRoomList = new ArrayList<>();
                    for (Playable player : newPlayersInTheRoom) {
                        newPlayersInTheRoomList.add(player);
                    }
                    List<Scene> newPlayerScenes = matchThePlayerScenes(newPlayersInTheRoomList);
                    SimpleMessageWindow.display(fallenRoom.getName() + " is still fallen, one character will be eaten");
                    String vote = "";
                    List<String> votes = new ArrayList<>();
                    for (int x = 0; x < newPlayersInTheRoomList.size(); x++) {
                        Playable player = newPlayersInTheRoomList.get(x);
                        mainWindow.setScene(newPlayerScenes.get(x));
                        vote = ChoosingColorWindow.display(newPlayersInTheRoomList, player + " please vote whose character will be eaten, In color the list:" + newPlayersInTheRoomList);
                        votes.add(player.getColor());
                        votes.add(vote);
                    }
                    fallenRoom.resetVoteResult();
                    fallenRoom.voteResultAfterVote(votes);
                    List<String> results = new ArrayList<>();
                    for (int l = 0; l < votes.size(); l += 2) {
                        results.add(gameBroad.matchPlayer(votes.get(l)) + " has voted " + votes.get(l + 1));
                    }
                    results.add("Summary: " + fallenRoom.getCurrentVoteResult());
                    MultiMessagesWindow.display(results, "Voting Result");
                    //using Threat to change result;
                    if (teamHasThreat(newPlayersInTheRoom)) {
                        boolean teamUsedThreat = YesNoWindow.display("Voting result can be changed by item THREAT, anyone want to change the result?(y/n)");
                        if (teamUsedThreat) {
                            boolean moreThreatused;
                            do {
                                moreThreatused = false;
                                int numThreat = 0;
                                for (int x = 0; x < newPlayersInTheRoomList.size(); x++) {
                                    Playable teammember = newPlayersInTheRoomList.get(x);
                                    mainWindow.setScene(newPlayerScenes.get(x));
                                    List<Integer> threadOptions = new ArrayList<>();
                                    for (int q = 0; q <= teammember.threatNum(); q++) {
                                        threadOptions.add(q);
                                    }
                                    numThreat = numberWindow.display(threadOptions, teammember + " please select how many THREAT you want use?");
                                    String effectedColor = "";
                                    for (int q = 0; q < votes.size(); q += 2) {
                                        if (teammember.getColor().equalsIgnoreCase(votes.get(q))) {
                                            effectedColor = votes.get(q + 1);
                                        }
                                    }
                                    effectedColor = effectedColor.toUpperCase();
                                    gameBroad.matchRoom(4).voteResultAfterItem(effectedColor, numThreat);
                                    for (int q = 0; q < numThreat; q++) {
                                        Item threat = gameBroad.matchItem(teammember, "Threat");
                                        teammember.usedItem(threat);
                                    }
                                }
                                SimpleMessageWindow.display("Result after the THREAT used: " + gameBroad.matchRoom(4).getCurrentVoteResult());
                                moreThreatused = YesNoWindow.display("Please confirm no more THREAT will be used (y - there will be more THREAT/n - no more THREAT)");
                            }
                            while (moreThreatused);
                        }
                    }
                    //result print
                    Playable loser = new Playable();
                    if (fallenRoom.winner().equals("TIE")) {
                        SimpleMessageWindow.display("Result is TIE" +
                                "\nThe result will be ramdomly choosed");
                        List<Playable> losers = new ArrayList<>();
                        for (Playable player : newPlayersInTheRoom) {
                            losers.add(player);
                        }
                        Random generator = new Random();
                        int num = generator.nextInt(losers.size());
                        loser = losers.get(num);
                        SimpleMessageWindow.display(loser + " has been chosed, one of character his/her character in the room will be eaten. ");
                    } else {
                        String winnercolor = fallenRoom.winner();
                        SimpleMessageWindow.display("Voting Result: " + fallenRoom.getCurrentVoteResult() +
                                "\n" + gameBroad.matchPlayer(winnercolor) + " get most vote and one of his/her character in the room will be eaten.");
                        ;
                        loser = gameBroad.matchPlayer(winnercolor);
                    }
                    //the chosen player lost his/her character in the room
                    String deathCharacterStr = "";
                    HashSet<GameCharacter> availableOptionsSet = fallenRoom.existChracterForThatPlayer(loser);
                    List<GameCharacter> availableOptions = new ArrayList<GameCharacter>();
                    for (GameCharacter character : availableOptionsSet) {
                        availableOptions.add(character);
                    }
                    deathCharacterStr = GameCharacterWindow.display(availableOptions, loser + " please selected your character in this room");
                    GameCharacter deathCharacter = gameBroad.matchGameCharacter(loser, deathCharacterStr);
                    loser.removeCharacter(deathCharacter);
                    fallenRoom.leave(deathCharacter);
                    fallenRoom.setCurrentZombienumber(0);
                    SimpleMessageWindow.display(loser + " has lost his/her " + deathCharacterStr
                            + "\nZombies have their feast, and returned back to somewhere else to find their next target!" +
                            "\n(The number of zombies in this room has returned to zero)");
                }
                //after effect for certain items
                for (Item item : usedItemsList) {
                    item.afterEffect(gameBroad);
                }
                usedItemsList.clear();
            }
        }
                if (count == 0) {
                    SimpleMessageWindow.display("No room has fallen this turn, but more zombies are still approaching.");
                        }
                for (Playable player : gameBroad.getPlayers()) {
                    if (player.remaingCharacter() == 0) {
                        SimpleMessageWindow.display("Due to " + player + " has no more character, " + player + " has been removed from the Game Broad.");
                        gameBroad.removePlayer(player);
                    }
                }
                SimpleMessageWindow.display("One round has been finished, game will move back to parking search, " +
                        "\nOnce there are less than four character in the game, the one with most victory points won.");
                if (gameBroad.totalCharatersRemain()>4){
                mainWindow.setScene(parkingSearchScene);
                }else {
                    mainWindow.setScene(winnerScene);
                }

    }

    public void whosTheWinner(){
        int mostPoints = gameBroad.getPlayers().get(0).totalVictoryPoints();
        int q = 0;
        int count =0;
        for (int i=0; i<gameBroad.getPlayers().size();i++){
            if (mostPoints<gameBroad.getPlayers().get(i).totalVictoryPoints()){
                mostPoints = gameBroad.getPlayers().get(i).totalVictoryPoints();
                q = i;
            }
        }
        for (Playable player: gameBroad.getPlayers()){
            if(mostPoints == player.totalVictoryPoints()){
                count++;
            }
        }
        if (count>1){
            SimpleMessageWindow.display("Result is TIE, ");
        }
        else {
            Playable winner  = gameBroad.getPlayers().get(q);
            SimpleMessageWindow.display("Congratulations! Winner is " + winner + " with a victory points" + mostPoints);
        }
    }




    public static boolean teamHasThreat(HashSet<Playable> players) {
        for (Playable player : players) {
            if (player.hasThreat())
                return true;
        }
        return false;
    }

    public static boolean teamHasSecurityCamera(List<Playable> players) {
        for (Playable player : players) {
            if (player.hasSecurityCamera()) {
                return true;
            }
        }
        return false;
    }

    public static boolean teamHasOtherItems(HashSet<Playable> players) {
        for (Playable player : players) {
            if (player.hasOthersItems()) {
                return true;
            }
        }
        return false;
    }

    /**
     * print the list in list form 1.xxx 2.yyyy 3........
     *
     * @param objects the list
     */

    public static String  printTheListWithNumber(List<Item> objects) {
        String fin ="";
        int start = 1;
        for (Object o : objects) {
            fin += start + "." + o + ", ";
            start++;
        }
        return  fin;
    }

    /**
     * print the list option 1. 2. 3. ...........
     *
     * @param objects the list
     */

    public static String  printTheOptions(List<Item> objects) {
        String fin = "";
        int start = 1;
        for (Object o : objects) {
            fin += start + ".";
            start++;
        }
        return fin;
    }

    public static List<GameCharacter> characterNotInTheRoom(Room room, Playable player) {
        List<GameCharacter> notInTheRoomList = new ArrayList<GameCharacter>();
        for (GameCharacter character : player.getGameCharacters()) {
            if (!room.inTheRoom(character)) {
                notInTheRoomList.add(character);
            }
        }
        return notInTheRoomList;
    }

    public static List<Scene> matchThePlayerScenes(List<Playable> players) {
        List<Scene> playerScenes = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Black");
        for (int i = 0; i < players.size(); i++) {
            for (int q = 0; q < colors.size(); q++) {
                if (players.get(i).getColor().equalsIgnoreCase(colors.get(q))) {
                    playerScenes.add(actualPlayerScenes.get(q));
                }
            }
        }
        return playerScenes;
    }


}





