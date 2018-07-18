package Hotel2.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private RoomState roomState;
    private RoomStandard roomStandard;
    private List<Guest> guestList;

    public Room(int roomNumber, RoomStandard roomStandard) {
        this.roomNumber = roomNumber;
        this.roomState = RoomState.FREE;
        this.roomStandard = roomStandard;
        this.guestList = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomState getRoomState() {
        return roomState;
    }

    public void setRoomState(RoomState roomState) {
        this.roomState = roomState;
    }

    public RoomStandard getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(RoomStandard roomStandard) {
        this.roomStandard = roomStandard;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomState=" + roomState +
                ", roomStandard=" + roomStandard +
                ", guestList=" + guestList +
                '}';
    }
}
