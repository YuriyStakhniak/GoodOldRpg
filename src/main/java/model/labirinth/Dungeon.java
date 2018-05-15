package model.labirinth;

import lombok.Getter;
import util.GameConst;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon implements GameConst {
    @Getter
    private ArrayList<Room> rooms = new ArrayList<>();

    public Dungeon() {
        dungeonGenerator();
    }

    private void dungeonGenerator() {
        createMainLine();
        for (int i = 0; i < LABYRINTH_WIDTH; i++) {
            createSideline();
        }
    }

    public void createMainLine() {
        Room room1 = new Room(Rooms.FIRST_ROOM);
        Room room2;
        rooms.add(room1);
        for (int i = 1; i < LABYRINTH_LENGHT; i++) {
            room2 = Room.randomRoomGenerating();
            setExits(room1, room2);
            rooms.add(room2);
            room1 = room2;
        }
        room2 = new Room(Rooms.LAST_ROOM);
        setExits(room1, room2);
        rooms.add(room2);
        System.out.println(rooms);
    }

    private void createSideline() {
        int j = (int) (Math.random() * (LABYRINTH_LENGHT - 1)) + 1;
        Room room1 = rooms.get(j);
        Room room2;
        for (int i = 0; i < Math.random() * 2 + 3; i++) {
            room2 = Room.randomRoomGenerating();
            setExits(room1, room2);
            rooms.add(room2);
            room1 = room2;
        }
    }

    private void setExits(Room r1, Room r2) {
        r1.addExit(r2);
        r2.addExit(r1);
    }
    /////////////////////////////////////// end generating dungeon /////////////////////////////////////////////////////
    public void printMap(){
//        for(int i=0;i<maxLength;i++){
//            System.out.print (this.rooms.get(i).getName()+" >>>> ");
//            for(Room r:this.rooms.get(i).getExits()){
//                System.out.print("["+r.getName()+"] ");
//            }
//            System.out.println();
//        }
    }

}
