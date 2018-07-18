package Hotel2.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String address;
    private List<Room> roomList;

    public Hotel() {
        roomList = new ArrayList<>();
        roomList.add(new Room(101, RoomStandard.LOW));
        roomList.add(new Room(102, RoomStandard.MEDIUM));
        roomList.add(new Room(103, RoomStandard.HIGH));
        roomList.add(new Room(104, RoomStandard.LOW));
        roomList.add(new Room(105, RoomStandard.MEDIUM));
        roomList.add(new Room(106, RoomStandard.HIGH));

    }
    public List<Room> getAllRooms(){
        return  roomList;
    }
}
