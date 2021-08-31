package one.digitalinnovation.functionalInterfaces;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        Function<String, String> returnReversedName = text -> new StringBuilder(text).reverse().toString();
        System.out.println(returnReversedName.apply("Ricky"));

        Function<String, Integer> convertStringToInteger = Integer::valueOf;
        System.out.println(convertStringToInteger.apply("2")); // 2

        Function<String, Integer> convertStringToIntegerAndMultiply = string -> Integer.valueOf(string) * 5;
        System.out.println(convertStringToIntegerAndMultiply.apply("2")); // 10
    }
}
