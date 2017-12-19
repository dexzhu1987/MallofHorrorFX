package Model.Item;

import java.util.*;

import Controller.GameCharacterWindow;
import Controller.MultiMessagesWindow;
import Controller.SimpleMessageWindow;
import Model.Character.*;
import Model.Room.*;
import Model.Game.*;
import Model.Playable.*;

public class Hidden extends Item {
    public Hidden() {
        super(6, "Hidden");
    }

    public void effect(Playable player, Room room) {
        String charselect = "";
        HashSet<GameCharacter> existedCharacters = room.existChracterForThatPlayer(player);
        List<GameCharacter> existedCharactersList = new ArrayList<>();
        for (GameCharacter character: existedCharacters){
            existedCharactersList.add(character);
        }
        charselect = GameCharacterWindow.display(existedCharactersList, "-------------------------------Hidden------------------------------------------"+
                "\nYou have choosed Hidden"+
                "\nYou will be hiding during the whole process, (you will not be eaten nor can join the voting)"+
                "\nCosider your character temporaly leaving the room"+
                "\n" + player + "pleaese choose the character you want to hide. " );
        GameCharacter selectedCharacter = new ToughGuy();
        for (GameCharacter character: existedCharacters){
            if (charselect.equalsIgnoreCase(character.getName())){
                selectedCharacter = character;
            }
        }
        room.leave(selectedCharacter);
        SimpleMessageWindow.display(selectedCharacter + " temporarily lefted " + room.getName());
        affectedRoomNumber = room.getRoomNum();
        affectedGameCharacter = selectedCharacter;
    }

    public void afterEffect(GameBroad gameBroad){
        List<String> messages = new ArrayList<>();
        messages.add("Due to Hidden has been used, aftereffect(entering back to the room is triggerd)");
        gameBroad.matchRoom(affectedRoomNumber).enter(affectedGameCharacter);
        messages.add(affectedGameCharacter + " has entered back to " + gameBroad.matchRoom(affectedRoomNumber).getName());
        messages.add("------------------------------------------------------------------------------");
        MultiMessagesWindow.display(messages,"--------------------------------Hidden-----------------------------------------" );
    }

    public static void main(String[] args) {
        GameBroad gb = new GameBroad(1);
        Room r1 = gb.matchRoom(4);
        Playable p1 = gb.getPlayers().get(0);

        Item item = new Hidden();
        p1.setColor("RED");
        r1.enter(p1.getGameCharacters().get(0));
        r1.enter(p1.getGameCharacters().get(1));

        item.effect(p1, r1);
        item.afterEffect(gb);

    }

}
