import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Hotel hotel = new Hotel();
    // Main class
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Main menu, logins, etc
        boolean repeatMenu = true;
        while(repeatMenu){
            System.out.println("\nMain menu");
            System.out.println("1) Guest Login");
            System.out.println("2) Employee Login");
            System.out.println("3) Exit");
            try {
                int menuChoice = input.nextInt();
                switch(menuChoice) {
                    case 1:
                        guestLogin(input);
                        break;
                    case 2:
                        employeeLogin(input);
                        break;
                    case 3:
                        repeatMenu = false;
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                }
            }
            catch(Exception IOException){

            }
        }
    }

    public static void employeeLogin(Scanner input) {
        String password = "password";
        System.out.println("Welcome employee,");
        System.out.print("Please enter your login password: ");
        String passwordCheck = input.next();

        if (passwordCheck == password) {
            employeeMenu(input);
        }
    }

    public static void guestLogin(Scanner input) {
        String password = "password";
        System.out.println("Welcome guest,");
        System.out.print("Please enter your login password: ");
        String passwordCheck = input.next();

        if (passwordCheck == password) {
            guestMenu(input);
        }
    }

    public static void guestMenu(Scanner input) {
        // Login as user
        System.out.println("\n1) Check rooms available");
        System.out.println("2) Logout");
        boolean repeatMenu = true;
        while(repeatMenu){
        try {
            int choice = input.nextInt();
            // run methods based on the choice.
            switch(choice) {
                case 1:
                    Hotel.listavai(hotel);
                    break;
                case 2:
                    repeatMenu = false;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
        catch(Exception IOException) {
        }
        }
    }

    public static void employeeMenu(Scanner input) {
        System.out.println("\n1) Check rooms available");
        System.out.println("2) Check occupied rooms");
        System.out.println("3) Check closed rooms");
        System.out.println("4) Edit rooms");
        System.out.println("5) Logout");

        boolean repeatMenu = true;
        while(repeatMenu){
        try {
            int choice = input.nextInt();
            // run methods based on the choice.
            switch(choice) {
                case 1:
                    Hotel.listavai(hotel);
                    break;
                case 2:
                    Hotel.listocc(hotel);
                    break;
                case 3:
                    Hotel.listclosed(hotel);
                    break;
                case 4:
                    System.out.println("Enter the room you would like to edit:");
                    int roomNumber = input.nextInt();
                    System.out.println("What would you like to do?");
                    System.out.println("1) Change vaccancy");
                    System.out.println("2) Close room");
                    System.out.println("3) Exit");
                    int menuChoice = input.nextInt();
                    switch(menuChoice) {
                        case 1:
                            Hotel.changeVacc(hotel, roomNumber);
                            break;
                        case 2:
                            Hotel.closeRoom(hotel, roomNumber);
                            break;
                        default:
                            System.out.println("Invalid Choice.");
                    }
                    break;
                case 5:
                    repeatMenu = false;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
        catch(Exception IOException) {
        }
        }
    }
}
