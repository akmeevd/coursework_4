import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("alex", 26);
        User user2 = new User("paul", 26);
        User user3 = new User("mary", 30);
        User user4 = new User("phil", 45);
        User user5 = new User("rick", 20);
        User user6 = new User("morty", 20);
        User user7 = new User("angie", 23);
        User user8 = new User("chris", 19);
        User user9 = new User("peter", 30);
        User user10 = new User("alex", 26);
        Collection<User> users = new ArrayList<>
                (List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));
        User oldestUser = User.getOldestUserAndSortAndDeleteRepeatingUsers(users);
        System.out.println(oldestUser);
    }
}
