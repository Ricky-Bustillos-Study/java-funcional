package one.digitalinnovation.functionalInterfaces;

import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {

        // Supplier<Person> personInstance = () -> new Person();
        Supplier<Person> personInstance = Person::new;

        System.out.println(personInstance.get());
    }
}

class Person {

    private String name;
    private Integer age;

    public Person() {
        name = "Ricky";
        age = 21;
    }

    @Override
    public String toString() {
        return String.format("name: %s, age: %d", name, age);
    }
}
