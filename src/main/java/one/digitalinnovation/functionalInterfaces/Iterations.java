package one.digitalinnovation.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterations {

    public static void main(String[] args) {

        String[] names = {"Ricky", "Mariana", "Priscila", "Patricia", "Rafaela", "Rafaela", "Marco"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        printFilteredNames(names);
        printAllNames(names);
        printDoubleOfEachListItem(numbers);

        List<String> professions = new ArrayList<>();
        professions.add("Developer");
        professions.add("Tester");
        professions.add("Project manager");
        professions.add("Quality manager");
        professions.stream()
                .filter(profession -> profession.contains("manager"))
                .forEach(System.out::println);
    }

    public static void printFilteredNames(String... names){

        String namesToPrint = "";
        for (int i = 0; i < names.length; i++) {
            if ( names[i].equals("Rafaela")) {
                namesToPrint += names[i];
            }
        }
        System.out.println("For: " + namesToPrint);

        String namesToPrintStream = Stream.of(names)
                .filter(name -> name.equals("Rafaela"))
                .collect(Collectors.joining()); // String[] to String with space
        System.out.println("Stream: " + namesToPrintStream);
    }

    public static void printAllNames(String... names) {
        for (String name : names) {
            System.out.println("For: " + name);
        }

        Stream.of(names)
                .forEach(name -> System.out.println("Stream forEach: " + name));
    }

    public static void printDoubleOfEachListItem(Integer... numbers) {
        for (Integer number : numbers) {
            System.out.println(number * 2);
        }

        Stream.of(numbers)
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}
