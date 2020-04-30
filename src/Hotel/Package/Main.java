package Hotel.Package;
import java.util.Scanner;

public class Main {

    // Main class
    public static void main(String[] args) {
        main_menu main0 = new main_menu(); //Creates the main menu class that will call the facade design pattern.
        Scanner input = new Scanner(System.in);
        // Main menu, logins, etc
        boolean repeatMenu = true;
        while (repeatMenu) {
            System.out.println("\nMain menu");
            System.out.println("1) Guest Login");
            System.out.println("2) Employee Login");
            System.out.println("3) Exit");
            try {
                int menuChoice = input.nextInt();
                switch (menuChoice) {
                    case 1:
                        main0.guestLogin(input);
                        break;
                    case 2:
                        main0.employeeLogin(input);
                        break;
                    case 3:
                        repeatMenu = false;
                        break;
                    default:
                        System.out.println("Invalid Choice.");
                }
            } catch (Exception IOException) {
                System.out.println("There was an error");
            }
        }
    }
}
