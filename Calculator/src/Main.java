
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {


        Calculator calculator = new Calculator();

        Random randomizer = new Random();

        int number1 = randomizer.nextInt(calculator.add);
        int number2 = randomizer.nextInt(calculator.subtract);
        int number3 = randomizer.nextInt(calculator.divide);
        int nummer4 = randomizer.nextInt(calculator.multiply);

        System.out.println("add:" + number1);
        System.out.println("Subtract:" + number2);
        System.out.println("Divide:"  + number3);
        System.out.println("Multiply:" + nummer4);



    }
}
