package Hotel2;

import Hotel2.model.Guest;
import Hotel2.model.Hotel;
import Hotel2.model.Room;
import Hotel2.service.HotelService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(new Hotel());

        for (Room room : hotelService.getAllRooms()) {
            System.out.println("wszystkie pokoje: " + room);
        }
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("jan1", "kowalski1", LocalDate.parse("1990-10-11")));
        guests.add(new Guest("jan2", "kowalski2", LocalDate.parse("1990-10-12")));
        guests.add(new Guest("jan3", "kowalski3", LocalDate.parse("1990-10-13")));
        guests.add(new Guest("jan4", "kowalski4", LocalDate.parse("1990-10-14")));

        hotelService.bookRoom(101,guests);

        System.out.println();

        for (Room room : hotelService.getFreeRooms()) {
            System.out.println("wolne pokoje: " + room);
        }
    }
}
