package random.java8.function.Consumer;

import java.util.function.Consumer;

/**
 * Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
 */
public class LambdaApp {

    public static void main(String[] args) {

        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов
    }
}
