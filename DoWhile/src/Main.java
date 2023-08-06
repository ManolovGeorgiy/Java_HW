import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        Random random = new Random();

        int number1 = random.nextInt(10)+1;
        int number2 = random.nextInt(5)+1;
        int number3 = random.nextInt(15)+1;
        int number4 = random.nextInt(7)+1;{

        }

        String correctNumber = "12";
        String corretNumber1 = " ";

        System.out.println();

        do {
            System.out.println("Давайте пройдём aрифметический опросник!");
            System.out.println();
            System.out.println("Сколько будет?: " + number2 + " + " + number1);
            System.out.println("Введите ответ:");
            String add = scanner.nextLine();
            System.out.println();
            System.out.println("Так держать!");
            System.out.println();


            System.out.println("Сколько будет?: " + number1 + " - " + number2);
            System.out.println("Введите ответ:");
            String subtract = scanner.nextLine();
            System.out.println();

            System.out.println("Сколько будет?: " + number1 + " / " + number2);
            System.out.println("Введите ответ:");
            String divide = scanner.nextLine();
            System.out.println();



            System.out.println("Сколько будет?: " + number1 + " * " + number2);
            System.out.println("Введите ответ:");
            String multiply = scanner.nextLine();

            System.out.println();

            System.out.println("Сколько будет?: " + number3 + " + " + number4);
            System.out.println("Введите ответ:");
            String add1 = scanner.nextLine();
            System.out.println();
            System.out.println("Отлично! Двигаемся дальше!");
            System.out.println();


            System.out.println("Сколько будет?: " + number3 + " - " + number2);
            System.out.println("Введите ответ:");
            String subtract2 = scanner.nextLine();
            System.out.println();

            System.out.println("Сколько будет?: " + number1 + " / " + number4);
            System.out.println("Введите ответ:");
            String divide3 = scanner.nextLine();
            System.out.println();

            System.out.println("Сколько будет?: " + "3" + " * " + "4");
            System.out.println("Введите ответ:");


            corretNumber1 = scanner.next();
        }   while(!corretNumber1.equals(correctNumber));

        System.out.println("Ура! Опросник завершён! Вы победили!");

        while (!corretNumber1.equals(correctNumber));
    }

}