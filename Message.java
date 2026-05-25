public class Message {
    private String recipientCell;
    private String message;
    private String messageHash;
    private int messageID;
    private static int totalMessages = 0;

    public Message(String recipientCell, String message) {
        this.recipientCell = recipientCell;
        this.message = message;
        this.messageID = ++totalMessages;
        generateHash();
    }

    public String getRecipientCell() { return recipientCell; }
    public String getMessage() { return message; }
    public int getMessageID() { return messageID; }
    public String getMessageHashValue() { return messageHash; }

    public String checkRecipientCell() {
        if (recipientCell.matches("^\\+[1-9][0-9]{7,14}$")) {
            return "Cell phone number successfully captured.";
        } else {
            return "Invalid number. Use format +[country code][number]";
        }
    }

    private void generateHash() {
        messageHash = Integer.toHexString(message.hashCode());
    }

    public String printMessage() {
        return "Message ID: " + messageID +
               "\nRecipient: " + recipientCell +
               "\nHash: " + messageHash +
               "\nMessage: " + message;
    }
}