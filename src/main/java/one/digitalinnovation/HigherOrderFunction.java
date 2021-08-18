package one.digitalinnovation;

public class HigherOrderFunction {

    public static void main(String[] args) {
        Calculation sum = (a, b) -> a + b;
        Calculation subtract = (a, b) -> a - b;
        Calculation divide = (a, b) -> a / b;
        Calculation multiply = (a, b) -> a * b;

        System.out.println( execCalc(sum, 8, 2) ); // 10
        System.out.println( execCalc(subtract, 8, 2) ); // 6
        System.out.println( execCalc(divide, 8, 2) ); // 4
        System.out.println( execCalc(multiply, 8, 2) ); // 16
    }

    // higher order function
    public static int execCalc(Calculation operation, int a, int b){
        return operation.calc(a, b);
    }
}

@FunctionalInterface
interface Calculation {
    public int calc(int a, int b);
}
