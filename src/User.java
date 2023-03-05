import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class User implements Comparable<User> {
    private final String name;
    private final Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static User getOldestUserAndSortAndDeleteRepeatingUsers(Collection<User> users) {
        users.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return users.stream()
                .max(Comparator.comparing(user -> user.age))
                .get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
