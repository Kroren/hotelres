import java.io.IOException;
import java.util.Scanner;

public class Main {
    Hotel hotel = new Hotel();
    // Main class
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Main menu, logins, etc
    }

    public static boolean employeeLogin(String password, Scanner scan) {
        String currentPass = "password";
        System.out.println("Welcome employee,");
        System.out.print("Please enter your login password: ");
        String input = scan.next();

        while (input == currentPass) {
            employeeMenu(scan);
        }
    }

    public static void userLogin() {
        // Login as user
    }

    public static void employeeMenu(Scanner s) {
        System.out.println("\n1. Check rooms available");
        System.out.println("2. Check occupied rooms");
        System.out.println("3. Check occupied rooms");
        System.out.println("4. Check closed rooms");
        System.out.println("5. Edit rooms");
        System.out.println("6. Logout");

        try {
            int choice = s.nextInt();
            // run methods based on the choice.
            switch(choice) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:
                    break;
            }
        }
        catch(IOException) {

        }
    }
}
