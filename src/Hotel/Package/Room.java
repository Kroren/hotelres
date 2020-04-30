package Hotel.Package;

public class Room {
    // this represents the room object and the properties of the room.
    public final int number;
    public boolean vaccancy;
    public boolean open;
    public String Guest;

    Room(int num, boolean vacc, boolean isOpen) {
        number =  num;
        vaccancy = vacc;
        open = isOpen;
        Guest = null; //Guest is null by default
    }
}