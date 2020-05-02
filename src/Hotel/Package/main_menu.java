package Hotel.Package;

import Hotel.Package.HotelFacade;
import java.util.Scanner;

// Creates an interface for the functions provided to the user in main_menu()
interface MenuFunctions {
    // All function will take a Scanner object.
    void employeeLogin(Scanner i);
    void guestLogin(Scanner i);
    void guestMenu(Scanner i);
    void employeeMenu(Scanner i);
}

// the class providing the functions for the user cases, implementing Menufunctions
public class main_menu implements MenuFunctions {
    private HotelFacade facade; //Creates the facade design pattern class.

    public main_menu(){
        try {
            facade = new HotelFacade();
        }
        catch (Exception IOException){
            IOException.printStackTrace();
        }
    }


    public void employeeLogin(Scanner input) {
        String password = "password";
        System.out.println("Welcome employee,");
        System.out.print("Please enter your login password: ");
        String passwordCheck = input.next();

        if (passwordCheck.equals(password)) {
            employeeMenu(input);
        }
    }

    public void guestLogin(Scanner input) {
        System.out.println("Welcome guest,");
        guestMenu(input);

    }

    public void guestMenu(Scanner input) {
        // Login as user

        boolean repeatMenu = true;
        while (repeatMenu) {
            System.out.println("\n1) Check rooms available");
            System.out.println("2) Logout");
            try {
                int choice = input.nextInt();
                // run methods based on the choice.
                switch (choice) {
                    case 1:
                        facade.listAvailable(); //*Facade
                        break;
                    case 2:
                        repeatMenu = false;
                    default:
                        System.out.println("Invalid Choice.");
                }
            } catch (Exception IOException) {
                IOException.printStackTrace();
                System.out.println(IOException.toString());
            }
        }
    }


    public void employeeMenu(Scanner input) {

        boolean repeatMenu = true;
        while(repeatMenu){
            System.out.println("\n1) Check rooms available");
            System.out.println("2) Check occupied rooms");
            System.out.println("3) Check closed rooms");
            System.out.println("4) Edit rooms");
            System.out.println("5) Logout");
            try {
                int choice = input.nextInt();
                // run methods based on the choice.
                switch(choice) {
                    case 1:
                        facade.listAvailable(); //*Facade
                        break;
                    case 2:
                        facade.listOccupied(); //*Facade
                        break;
                    case 3:
                        facade.listClosed(); //*Facade
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
                                facade.changeVaccency(roomNumber); //*Facade
                                break;
                            case 2:
                                facade.closeRoom(roomNumber); //*Facade
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
                IOException.getStackTrace();
            }
        }
    }
}
