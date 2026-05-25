import java.util.HashMap;

public class Login {

    public static boolean loginUser(HashMap<String, User> users, String username, String password){
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)){
            System.out.println("Login successful!");
            return true;
        }

        System.out.println("Incorrect username or password.");
        return false;
    }
}