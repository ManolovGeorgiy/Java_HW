import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое сообщение:");
        String word1 = scanner.next();
        TextMessage textMessage1 = new TextMessage(word1);


        System.out.print("Введите второе сообщение: ");
        String word2 = scanner.next();
        TextMessage textMessage2 = new TextMessage(word2);

        System.out.print("Введите третье сообщение: ");
        String word3 = scanner.next();
        TextMessage textMessage3 = new TextMessage(word3);

    }
}