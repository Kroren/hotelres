import java.util.ArrayList;
import java.util.Scanner;


public class Hotel {
    public static ArrayList<Room> rooms; // Create a list of rooms from the room object.

    public Hotel() { //Initial constructor
        try {
            rooms = new ArrayList<>();
            for (int i = 100; i < 150; i++) {

                rooms.add(new Room(i, true, true));
                //System.out.println(i+", ");
            }
        }
        catch(Exception IOException){
            System.out.println("There was an error creating the hotel");
        }

        // Add rooms to the hotel
    }

    public static Room changeVacc(Hotel hotel, int rmNumber) { //employee accessible
        // Change vaccancy on selected room
        Scanner sc = new Scanner(System.in);
        Room rm = hotel.rooms.get(rmNumber);
        if (rm.vaccancy){ //mark the room as occupied
            rm.vaccancy = false;
            System.out.println("Enter Guest name: ");
            rm.Guest = sc.nextLine();
        }
        else if (!rm.vaccancy){ //mark the room as vaccant
            rm.vaccancy = true;
            rm.Guest = null;
        }
        return rm;
    }

    public static Room closeRoom(Hotel hotel, int rmNumber) { //employee accessible
        // Mark a room as closed or open
        Room rm = hotel.rooms.get(rmNumber);
        if (rm.open){ //close the room
            rm.open = false;
        }
        else if (!rm.open){ //open the room
            rm.open = true;
        }
        return rm;
    }

    public static void listavai(Hotel hotel){ //list available rooms - Guest and Employee
        System.out.print("\t\tAvailable Rooms\t\t\n");
        System.out.print("-----------------------------------------------\n");
        int j = 0;
        for (Room rm : rooms) {
            j += 1;
            if(rm.vaccancy && rm.open){
                System.out.print("|\t"+j+"\t"+"|\t"+rm.vaccancy+"\t"+"|\t"+rm.open+"\t"+"|\n");
            }
        }
        return;
    }

    public static void listclosed(Hotel hotel){ //list closed rooms - employee accessible
        System.out.print("\t\tClosed Rooms\t\t\n");
        System.out.print("-----------------------------------------\n");
        for (int i = 0; i < 50; i++) {
            int j = i+100;
            Room rm = hotel.rooms.get(i);
            if(!rm.open){
                System.out.print("|\t"+j+"\t"+"|\t"+rm.open+"\t"+"|\n");
            }
        }
        return;
    }
    public static void listocc(Hotel hotel){ //List all occupied rooms - employee accessible
        System.out.print("\t\tOccupied Rooms\t\t\n");
        System.out.print("-----------------------------------------\n");
        for (int i = 0; i < 50; i++) {
            int j = i+100;
            Room rm = hotel.rooms.get(i);
            if(!rm.vaccancy){
                System.out.print("|\t"+j+"\t"+"|\t"+rm.Guest+"\t"+"|\n");
            }
        }
    }
}
