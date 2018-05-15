package model.labirinth;

import lombok.Getter;

import java.util.stream.Stream;


@Getter
public enum Rooms {

    ROOM_1("1", "room of fear", "some description goes here"),
    ROOM_2("2", "post nuclear room", "some description goes here"),
    ROOM_3("3", "BDSM room", "some description goes here"),
    ROOM_4("4", "skeleton room", "some description goes here"),
    ROOM_5("5", "nice room", "some description goes here"),
    ROOM_6("6", "bedroom", "some description goes here"),
    ROOM_7("7", "fire room", "some description goes here"),
    ROOM_8("8", "magic room", "some description goes here"),
    ROOM_9("9", "terrarium", "some description goes here"),
    FIRST_ROOM("0", "start", "some description goes here"),
    LAST_ROOM("10", "finish", "some description goes here");

    private String id;
    private String name;
    private String description;

    Rooms(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private static Stream <Rooms> stream() {
        return Stream.of(Rooms.values());
    }

    public static Rooms getRoomById(String id){
        return Rooms.stream().filter(r -> r.getId().equals(id)).findFirst().get();
    }


}
