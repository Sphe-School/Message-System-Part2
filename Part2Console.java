import java.util.Scanner;

public class Part2Console {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recipient phone (+countrycode...): ");
        String phone = sc.nextLine();

        System.out.print("Enter your message: ");
        String msgText = sc.nextLine();

        Message msg = new Message(phone, msgText);

        System.out.println("\n" + msg.checkRecipientCell());
        System.out.println("\n" + msg.printMessage());

        
        MessageStore.store(msg);

        System.out.println("\nMessage saved to messages.txt");
    }
}