import java.io.FileWriter;
import java.io.IOException;

public class MessageStore {

    public static void store(Message msg) {
        try (FileWriter file = new FileWriter("messages.txt", true)) {

            file.write("Message ID: " + msg.getMessageID() + "\n");
            file.write("Recipient: " + msg.getRecipientCell() + "\n");
            file.write("Hash: " + msg.getMessageHashValue() + "\n");
            file.write("Message: " + msg.getMessage() + "\n");
            file.write("--------------------\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}