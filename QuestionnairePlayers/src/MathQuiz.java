import java.util.Random;
import java.util.Scanner;

class MathQuiz {
    private static final int question = 1;
    private static final int points = 5;
    private int[] Scores;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public MathQuiz() {
    }

    public void start() {


        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        Scores = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            System.out.println("Добро пожаловать на Викторину!" + " " + playerName);
            question1(playerName, i);
            question2(playerName, i);
            question3(playerName, i);
        }
        printFinalScores();
        scanner.close();
    }
    private void question1(String playerName, int playerIndex) {
        for (int i = 0; i < question; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int correctAnswer = Calculator.add(number1, number2);

            System.out.println("Вопрос " + (i + 1)  + ":");
            System.out.println("Сложите сумму из двух чисел: " + number1 + " + " + number2);
            System.out.print("Ваш ответ: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + points + " баллов");
                Scores[playerIndex] += points;
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + points + " баллов");
                Scores[playerIndex] -= points;
            }
            scanner.nextLine();
        }
    }
    private void question2(String playerName, int playerIndex) {
        for (int i = 0; i < question; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int correctAnswer = Calculator.multiply(number1, number2);

            System.out.println("Вопрос " + (i + 2) + ":");
            System.out.println("Умножте сумму из двух чисел: " + number1 + " * " + number2);
            System.out.print("Ваш ответ: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + points + " баллов");
                Scores[playerIndex] += points;
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + points + " баллов");
                Scores[playerIndex] -= points;
            }
            scanner.nextLine();
        }
    }
    private void question3(String playerName, int playerIndex) {
        for (int i = 0; i < question; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            int correctAnswer = Calculator.subtract(number1, number2);

            System.out.println("Вопрос " + (i + 3) +  ":");
            System.out.println("Зделайте вычитание  двух чисел: " + number1 + " - " + number2);
            System.out.print("Ваш ответ: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + points + " баллов");
                Scores[playerIndex] += points;
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + points + " баллов");
                Scores[playerIndex] -= points;
            }
            scanner.nextLine();
        }
    }

    private void printFinalScores() {
        System.out.println("Ура! Викторина завершена! Вы победили! Ваш финальный счёт:");
        for (int i = 0; i < Scores.length; i++) {
            System.out.println("Игрок " + (i + 1) + ": " + Scores[i] + " баллов");
        }
    }
}