package Hotel2.service;

import Hotel2.model.Guest;
import Hotel2.model.Hotel;
import Hotel2.model.Room;
import Hotel2.model.RoomState;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Room> getAllRooms() {
        return hotel.getAllRooms();
    }

    public List<Room> getFreeRooms() {
        List<Room> freeRooms = new ArrayList<>();
        for (Room room : hotel.getAllRooms()) {
            if (room.getRoomState() == RoomState.FREE) {
                freeRooms.add(room);
            }

        }
        return freeRooms;
    }

    public boolean bookRoom(int roomNumber, List<Guest> guestList) {
        for (Room room : getFreeRooms()) {
            if (room.getRoomNumber() == roomNumber) {
                room.setRoomState(RoomState.OCCUPIED);
                room.setGuestList(guestList);
                return true;
            }
        }
        return false;
    }

}
