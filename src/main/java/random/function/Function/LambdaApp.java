package random.function.Function;

import java.util.function.Function;

/**
 * Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R
 */
public class LambdaApp {

    public static void main(String[] args) {

        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов
    }
}

