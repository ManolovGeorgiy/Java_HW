import java.util.Random;
import java.util.Scanner;

class MathQuiz {
    private static final int Questions = 6;
    private static final int Points = 5;
    private int score;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);


    public MathQuiz() {

    }

    public void start() {
        score = 0;
        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Question6();
        printFinalScore();
    }
    private void Question1() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 + number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " + " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }
    }
    private void Question2() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 - number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " - " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }
    }
    private void Question3() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 * number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " * " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }

    }
    private void Question4() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 / number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " / " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }

    }
    private void Question5() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 + number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " + " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }
    }
    private void Question6() {
        int number1, number2, correctAnswer, userAnswer;
        int attempts = 1;

        number1 = random.nextInt(100);
        number2 = random.nextInt(100);
        correctAnswer = number1 * number2;

        for (int i = 0; i < attempts; i++) {
            System.out.println("Сложите сумму из двух чисел: " + number1 + " * " + number2);
            System.out.print("Ваш ответ : ");
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Правильный ответ, вы заработали " + Points + " баллов");
                score += Points;
                break; //
            } else {
                System.out.println("Неправильный ответ, вы потеряли " + (-Points) + " баллов");
                score -= Points;
                System.out.println();
            }
        }
    }
    public void printFinalScore() {
        System.out.println("Ура! Опросник завершён! Вы победили! Ваш финальный счёт: " + score);
        System.exit(0);
    }
}

