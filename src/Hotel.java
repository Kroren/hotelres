import java.util.ArrayList;

public class Hotel {
    public ArrayList<Room> rooms; // Create a list of rooms from the room object.

    public Hotel() {
        rooms = new ArrayList<>();
        for (int i = 100; i < 150; i++) {
            rooms.add(new Room(i, false));
        }
        // Add rooms to the hotel
    }

    public static Room changeVacc(int rmNumber) {
        // Change vaccancy on selected room
    }

    public static Room closeRoom(int rmNumber) {
        // Mark a room as closed or open
    }
}
