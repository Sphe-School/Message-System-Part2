import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {

    private HashMap<String, User> users = new HashMap<>();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter username: ");
                    String rUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String rPass = sc.nextLine();

                    Register.registerUser(users, rUser, rPass);
                    break;

                case "2":
                    System.out.print("Enter username: ");
                    String lUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String lPass = sc.nextLine();

                    boolean success = Login.loginUser(users, lUser, lPass);

                    if (success) {
                        System.out.println("\nWelcome to the Message System!");
                        Part2Console.run();
                    }
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}