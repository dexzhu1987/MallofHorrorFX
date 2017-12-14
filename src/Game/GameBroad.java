package Game;

import Dice.PairofDice;
import Item.*;
import Playable.*;
import Room.*;
import java.util.*;
import Character.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GameBroad{
  private List<Room> rooms;
  private List<Playable> players;
  private ItemDeck itemDeck;
  private Playable[] totalPlayerslist;
  private Room extraZombiesPlace;


  public GameBroad(int numplayer) {
    rooms = new ArrayList<>();
    rooms.add(new RestRoom());
    rooms.add(new Cachou());
    rooms.add(new Megatoys());
    rooms.add(new Parking());
    rooms.add(new SecurityHQ());
    rooms.add(new Supermarket());

    extraZombiesPlace = new ZombiesWonderingPlace();

    totalPlayerslist = new Playable[6];
    for (int i=0; i<totalPlayerslist.length; i++){
        totalPlayerslist[i]=new Player();
      }
    totalPlayerslist[0].setColor("RED");
    totalPlayerslist[1].setColor("YELLOW");
    totalPlayerslist[2].setColor("BLUE");
    totalPlayerslist[3].setColor("GREEN");
    totalPlayerslist[4].setColor("BROWN");
    totalPlayerslist[5].setColor("BLACK");

    players = new ArrayList<>();
    for (int i=0; i<numplayer; i++){
        players.add(totalPlayerslist[i]);
        for (int q=0; q<players.get(i).getGameCharacters().size(); q++){
            players.get(i).getGameCharacters().get(q).setOwnercolor(players.get(i).getColor());
            players.get(i).getCharactersselect().get(q).setOwnercolor(players.get(i).getColor());
        }
    }


    itemDeck = new ItemDeck();


  }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Playable> getPlayers() {
        return players;
    }

    public void removePlayer(Playable player){
      players.remove(player);
    }

    public ItemDeck getItemDeck() {
        return itemDeck;
    }

    public int totalCharatersRemain () {
      int sum=0;
      for (int i=0; i<players.size(); i++){
          sum += players.get(i).remaingCharacter();
      }
      return sum;
    }

    public Room matchRoom(int roomNum){
      int q = 0;
      for (int i=0; i<rooms.size(); i++){
          if (roomNum==rooms.get(i).getRoomNum()){
              q = i;
          }
      }
      return rooms.get(q);
    }

    public Playable matchPlayer(String color){
        int q = 0;
        for (int i=0; i<players.size(); i++){
            if (color.equalsIgnoreCase(players.get(i).getColor())){
                q = i;
            }
        }
        return players.get(q);
    }

    public Item matchItem(Playable player, String name){
        int q = 0;
        for (int i=0; i<player.getCurrentItem().size(); i++){
            if (name.equalsIgnoreCase(player.getCurrentItem().get(i).getName())){
                q = i;
            }
        }
        return player.getCurrentItem().get(q);
    }


    public GameCharacter matchGameCharacter(Playable player, String gameCharacter){
       int q = 0;
       for (int i=0; i<player.getGameCharacters().size(); i++){
           if (gameCharacter.equalsIgnoreCase(player.getGameCharacters().get(i).getName())){
               q = i;
           }
       }
       return player.getGameCharacters().get(q);
    }

    public Room inWhichRoom (GameCharacter character){
        int k=0;
        for (int i=0; i<rooms.size(); i++){
            for (int q=0; q<rooms.get(i).getRoomCharaters().size();q++)
            if (character.equals(rooms.get(i).getRoomCharaters().get(q))){
               k=i;
            }
        }
        return rooms.get(k);
    }

    public void printRooms(){
        for (int i=0; i<rooms.size(); i++){
            System.out.println(rooms.get(i));
        }
    }

    public HashSet<Playable> WhoCan(HashSet<String> existCharacterColors){
        HashSet<Playable> voteplayers = new HashSet<Playable>();
        for (String existCharacterColor: existCharacterColors) {
            for (int q = 0; q < players.size(); q++) {
                if (existCharacterColor.contains(players.get(q).getColor())) {
                    voteplayers.add(players.get(q));
                }
            }
        }
        return  voteplayers;
    }

    public HashSet<Playable> RemainPlayers(Playable winnerplayer){
        HashSet<Playable> remainplayers = new HashSet<>();

            for (int q = 0; q < players.size(); q++) {
                if (!winnerplayer.getColor().contains(players.get(q).getColor())) {
                    remainplayers.add(players.get(q));
                }

        }
        return  remainplayers;
    }

    /**
     * return the room that with the most Gamecharacter
     * @return the room with most people
     */
    public Room mostPeople(){
        int q=0;
        int maxPeople = rooms.get(0).getRoomCharaters().size();
        int count = 0;
        for (int i=0; i<rooms.size(); i++){
           if (maxPeople<rooms.get(i).getRoomCharaters().size()){
               maxPeople = rooms.get(i).getRoomCharaters().size();
               q = i;
           }
        }
        for (int i=0; i<rooms.size(); i++){
            if (maxPeople==rooms.get(i).getRoomCharaters().size()){
                count++;
            }
        }
        if (count>1){
            return extraZombiesPlace;
        } else {
            return rooms.get(q);
        }

    }

    public Room mostModel(){
        int q=0;
        int maxPeople = rooms.get(0).modelNumber();
        int count = 0;
        for (int i=0; i<rooms.size(); i++){
            if (maxPeople<rooms.get(i).modelNumber()){
                maxPeople = rooms.get(i).modelNumber();
                q = i;
            }
        }
        for (int i=0; i<rooms.size(); i++){
            if (maxPeople==rooms.get(i).modelNumber()){
                count++;
            }
        }
        if (count>1){
            return extraZombiesPlace;
        } else {
            return rooms.get(q);
        }

    }


    public static void main(String[] args) {
        GameBroad gameBroad = new GameBroad(2);

        gameBroad.getRooms().get(0).enter(new Model());
        gameBroad.getRooms().get(1).enter(new Model());
        gameBroad.getRooms().get(1).enter(new Model());
        gameBroad.getRooms().get(1).enter(new Model());
        gameBroad.getRooms().get(2).enter(new Model());
        gameBroad.getRooms().get(2).enter(new ToughGuy());
        gameBroad.getRooms().get(2).enter(new ToughGuy());

        gameBroad.printRooms();

        System.out.println(gameBroad.mostPeople().getName());
        System.out.println(gameBroad.mostModel().getName());

        //launch();///
    }
}
