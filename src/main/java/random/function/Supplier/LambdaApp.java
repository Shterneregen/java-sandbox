package random.function.Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T
 */
public class LambdaApp {

    public static void main(String[] args) {

        Supplier<User> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("user1 name: " + user1.getName());
        System.out.println("user2 name: " + user2.getName());
    }
}

class User {

    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }
}
