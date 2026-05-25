import java.util.HashMap;

public class Register {

    public static boolean registerUser(HashMap<String, User> users, String username, String password){
        if (users.containsKey(username)){
            System.out.println("Username already exists.");
            return false;
        }

        users.put(username, new User(username, password));
        System.out.println("Registration successful!");
        return true;
    }
}