package one.digitalinnovation;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        // Predicate<String> isEmpty2 = value -> value.isEmpty();
        /*
        Predicate<String> isEmpty2 = value -> {
            return value.isEmpty();
        };
        */
        Predicate<String> isEmpty2 = String::isEmpty;
        System.out.println(isEmpty2.test(""));
        System.out.println(isEmpty2.test("Ricky"));
    }
}
