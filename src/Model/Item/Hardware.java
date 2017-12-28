package Model.Item;

import Controller.MultiMessagesWindow;
import Model.Playable.*;
import Model.Room.*;
import Model.Game.*;

import java.util.ArrayList;
import java.util.List;

public class Hardware extends Item {
    public Hardware() {
        super(5, "Hareware");
    }

    public void effect(Playable player, Room room) {
        List <String> messages = new ArrayList<>();
        messages.add("You have choosed Hareware");
        messages.add("The defend of this room has temporarily increased by 1");
        room.zombieKilled();
        messages.add("A zomie has temporarly moved to somewhere else");
        affectedRoomNumber = room.getRoomNum();
        MultiMessagesWindow.display(messages,"-------------------------Hareware----------------------------");
    }

    public void afterEffect(GameBroad gameBroad){
        List <String> messages = new ArrayList<>();
        messages.add("Due to Hareware has been used, aftereffect is triggerd");
        gameBroad.matchRoom(affectedRoomNumber).zombieApproached();
        messages.add("The zombie left has returned");
        MultiMessagesWindow.display(messages,"------------------------Hareware------------------------------");
    }


}
