package Model.Room;

import java.util.*;
import Model.Character.*;
import Model.Playable.*;


public abstract class Room {
    protected int roomNum;
    protected String name;
    protected int capability;
    protected List<GameCharacter> roomCharaters;
    protected HashMap<String, Integer> currentVoteResult;
    protected int currentZombienumber;

    public Room(int roomNum, String name, int capability) {
        this.roomNum = roomNum;
        this.name = name;
        this.capability = capability;
        roomCharaters = new ArrayList<>();
        currentVoteResult = new HashMap<>();
        currentZombienumber = 0;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public String getName() {
        return name;
    }

    public int getCapability() {
        return capability;
    }

    public List<GameCharacter> getRoomCharaters() {
        return roomCharaters;
    }

    public void enter(GameCharacter character){
        roomCharaters.add(character);
    }

    public void leave(GameCharacter character){
        roomCharaters.remove(character);
    }

    public HashMap<String, Integer> getCurrentVoteResult() {
        return currentVoteResult;
    }

    public void setCurrentVoteResult(HashMap<String, Integer> currentVoteResult) {
        this.currentVoteResult = currentVoteResult;
    }

    public boolean isFull(){
        if (roomCharaters.size()>=capability){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty(){
        return roomCharaters.size()==0;
    }

    public void setCurrentZombienumber(int currentZombienumber) {
        this.currentZombienumber = currentZombienumber;
    }

    /**
     * if the room has enough strength to defend the zombies
     * @return whether the room has fallen, if it is (true), the zombies will attack
     */
    public boolean isFallen(){
        if (roomCharaters.size()>0) {
            int defend = 0;

            for (GameCharacter character : roomCharaters) {
                defend += character.getStrength();
            }
            if (currentZombienumber > defend) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public HashSet<String> existCharacterColor(){
        HashSet<String> existCharacterColor = new HashSet<>();
       for (int i=0; i<roomCharaters.size(); i++){
            existCharacterColor.add(roomCharaters.get(i).getOwnercolor());
        }

        return existCharacterColor;
    }

    public HashSet<GameCharacter> existChracterForThatPlayer(Playable player){
        HashSet<GameCharacter> existedCharacters = new HashSet<>();
        for (GameCharacter character: roomCharaters){
            if (character.getOwnercolor().equalsIgnoreCase(player.getColor())){
                existedCharacters.add(character);
            }
        }
        return existedCharacters;
    }

    public boolean inTheRoom(GameCharacter character){
        for (int i=0; i<roomCharaters.size(); i++){
           if(character.equals(roomCharaters.get(i))){
               return true;
           }
        }
        return false;
    }

    public boolean allInThisRoom(Playable player){
        for (int i=0; i<player.getGameCharacters().size();i++){
          if (!inTheRoom(player.getGameCharacters().get(i))){
              return false;
          }
        }
        return true;
    }

    /**
     * count how many models in the room
     * @return the number of the model in the room
     */
    public int modelNumber(){
        int modelNumber = 0;
        for (GameCharacter character: roomCharaters){
            if (character.getName().equalsIgnoreCase("Model")){
                modelNumber++;
            }
        }
        return modelNumber;
    }

    public void zombieApproached(){
        currentZombienumber++;
    }

    public void zombieKilled(){
        currentZombienumber--;
    }

    public int getCurrentZombienumber() {
        return currentZombienumber;
    }

    /**
     * method set the vote result using the potential votes in the room
     */

    public void  resetVoteResult(){
        HashMap<String, Integer> potentialVoteForEachColor = new HashMap<>();
        int votesum=0;
        for (int i=0; i<roomCharaters.size(); i++){
                    votesum=roomCharaters.get(i).getVote();
                    for (int q = i+1; q<roomCharaters.size(); q++){
                        if (roomCharaters.get(q).getOwnercolor().equalsIgnoreCase(roomCharaters.get(i).getOwnercolor())){
                            votesum+=roomCharaters.get(q).getVote();
                        }
                    }
                    if (!potentialVoteForEachColor.containsKey(roomCharaters.get(i).getOwnercolor())){
                        potentialVoteForEachColor.put(roomCharaters.get(i).getOwnercolor(),votesum);
                    }

        }
        setCurrentVoteResult(potentialVoteForEachColor);
    }

    /**
     * set the currentresult to result after vote
     * @param votes
     */
    public void voteResultAfterVote(List<String> votes){
        HashMap<String, Integer> actualVoteForEachColor = new HashMap<>();

        for (String color: existCharacterColor()){
            int votesum=0;
         for (int q=1; q<votes.size(); q+=2)   {
            if (color.equalsIgnoreCase(votes.get(q))){
              votesum+= currentVoteResult.get(votes.get(q-1));
            }
         }
         actualVoteForEachColor.put(color, votesum);
        }
        setCurrentVoteResult(actualVoteForEachColor);
    }

    /**
     * set the currentvoteresult to a new result after items used
     * @param color
     * @param increaseNum
     */
    public void voteResultAfterItem(String color, int increaseNum){
        String COLOR = color.toUpperCase();
        int originalvote = currentVoteResult.get(COLOR);
        int newvote = originalvote + increaseNum;
        currentVoteResult.replace(color,newvote);

    }

    public String winner(){
        List<String> keys = new ArrayList<>(currentVoteResult.keySet());
        List<Integer> values= new ArrayList<>(currentVoteResult.values());
        if (values.size()>0){
            int max=values.get(0);
            for (int i=0; i<values.size(); i++){
                if (max<values.get(i)){
                    max=values.get(i);
                }
            }
            int q=0;
            int count=0;
            for (int i=0; i<values.size();i++){
                if (max==values.get(i)){
                    q=i;
                    count++;
                }
            }
            if (count>1){
                return "TIE";
            }
            else {
                return keys.get(q);
            }
        }
        else {
            return "TIE";
        }
    }

    @Override
    public String toString() {
        String spaces="";
        for (int i=0; i<70-(roomCharaters.toString().length()); i++){
            spaces+=" ";
        }
        String spaces2="";
        for (int i=0; i<13-name.length(); i++){
            spaces2+=" ";
        }
        return "ROOM "+roomNum + ". " + name + " (Capability: " + capability + ") " + spaces2 + " has " + roomCharaters + spaces + "Current Zombies number: " + currentZombienumber;
    }


    public static void main(String[] args) {
        Room r1=new Supermarket();
        GameCharacter c1=new Model();
        GameCharacter c2=new GunMan();
        GameCharacter c3=new ToughGuy();
        GameCharacter c4=new GunMan();
        GameCharacter c5=new Model();
        c1.setOwnercolor("RED");
        c2.setOwnercolor("YELLOW");
        c3.setOwnercolor("RED");
        c4.setOwnercolor("YELLOW");
        c5.setOwnercolor("YELLOW");
        r1.enter(c1);
        r1.enter(c2);
        r1.enter(c3);
        r1.enter(c4);
        r1.enter(c5);
//        System.out.println(r1);
//        r1.resetVoteResult();
//        System.out.println(r1.getCurrentVoteResult());
//        List<String> votes = new ArrayList<>();
//        votes.add("RED");
//        votes.add("yellow");
//        votes.add("YELLOW");
//        votes.add("RED");
//        r1.voteResultAfterVote(votes);
//        System.out.println(r1.getCurrentVoteResult());
//        System.out.println(r1.winner());
//        r1.voteResultAfterItem("RED",3);
//        r1.voteResultAfterItem("YELLOW",2);
//        System.out.println(r1.getCurrentVoteResult());
//        System.out.println(r1.winner());
//        String red = "red";
//        String RED = red.toUpperCase();
//        System.out.println(RED);
////        System.out.println(r1.modelNumber());
////        r1.zombieApproached();
////        r1.zombieApproached();
////        r1.zombieApproached();
////        r1.zombieApproached();
////
////
////        System.out.println(r1);
////        System.out.println(r1.isFallen());
        Playable player = new Playable();
        for (int q = 0; q < player.getGameCharacters().size(); q++) {
            player.getGameCharacters().get(q).setOwnercolor("RED");
            player.getCharactersselect().get(q).setOwnercolor("RED");
        }
        GameCharacter gunman = new GunMan();
        gunman.setOwnercolor("RED");
        player.removeCharacter(gunman);
        System.out.println(player.getGameCharacters());
        System.out.println(r1.allInThisRoom(player));

    }
}
