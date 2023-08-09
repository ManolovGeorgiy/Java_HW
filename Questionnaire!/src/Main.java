import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Давайте пройдем арифметический опросник  из 6 примеров");
        System.out.print("Согласны? ");
        scanner.nextLine();
        System.out.println("Тогда поехали!");
        System.out.println();

        mathQuiz.start();

    }
}
