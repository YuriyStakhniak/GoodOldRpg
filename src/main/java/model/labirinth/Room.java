package model.labirinth;

import lombok.Getter;
import lombok.Setter;
import util.GameConst;

import java.util.*;

@Getter
@Setter
public class Room implements GameConst {

    private String name;
    private String description;
//    private String doorSignboard;
//    private int enemiesNumberHp;
//    private Random random = new Random();
//    private List<AbstractMonster> enemies = new ArrayList<>();
    private List<Room> exits = new ArrayList<>();
//    private Map<String, Integer> minMonstersHealth = new HashMap<>();
//    private String monstersType;

    Room(Rooms room) {
        this.name = room.getName();
        this.description = room.getDescription();
    }

   public static Room randomRoomGenerating() {
        return new Room(Rooms.getRoomById(randomRoomId()));
    }

   public static String randomRoomId() {
        return String.valueOf(new Random().nextInt(((Rooms.values().length -2) -
                MIN_ROOM_QUANTITY) + 1) + MIN_ROOM_QUANTITY);
    }

    void addExit(Room r) {
        exits.add(r);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
