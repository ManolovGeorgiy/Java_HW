import java.util.Scanner;
import java.util.Random;
class MathQuiz {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numberPlayers = scanner.nextInt();
        scanner.nextLine();

        String[] playerNames = new String[numberPlayers];
        int[] playerScores = new int[numberPlayers];

        Calculator calculator = new Calculator();

        for (int playerIndex = 0; playerIndex < numberPlayers; playerIndex++) {
            System.out.print("Игрок " + (playerIndex + 1)+ "." + " Введите ваше имя: ");
            playerNames[playerIndex] = scanner.nextLine();

            int score = 0;

            for (int questionNumber = 1; questionNumber <= 1; questionNumber++) {
                int number1 = (int) (Math.random() * 20) + 1;
                int number2 = (int) (Math.random() * 5) + 1;
                int correctAnswer = number1 + number2;

                System.out.println("Вопрос " + questionNumber + ": Сколько будет " + number1 + " + " + number2 + "?");

                int playerAnswer = scanner.nextInt();

                if (playerAnswer == correctAnswer) {
                    score += 5;
                } else {
                    score -= 5;
                }
                scanner.nextLine();
            }
            playerScores[playerIndex] = score;

            for (int questionNumber = 1; questionNumber <= 1; questionNumber++) {
                int number1 = (int) (Math.random() * 20) + 1;
                int number2 = (int) (Math.random() * 5) + 1;
                int correctAnswer = number1 - number2;

                System.out.println("Вопрос " + questionNumber + ": Сколько будет " + number1 + " - " + number2 + "?");
                int playerAnswer = scanner.nextInt();

                if (playerAnswer == correctAnswer) {
                    score += 5;
                } else {
                    score -= 5;
                }
                scanner.nextLine();
            }
            playerScores[playerIndex] = score;

            for (int questionNumber = 1; questionNumber <= 1; questionNumber++) {
                int number1 = (int) (Math.random() * 20) + 1;
                int number2 = (int) (Math.random() * 5) + 1 ;
                int correctAnswer = number1 * number2;

                System.out.println("Вопрос " + questionNumber + ": Сколько будет " + number1 + " * " + number2 + "?");
                int playerAnswer = scanner.nextInt();

                if (playerAnswer == correctAnswer) {
                    score += 5;
                } else {
                    score -= 5;
                }
                scanner.nextLine();
            }
            playerScores[playerIndex] = score;

            for (int questionNumber = 1; questionNumber <= 1; questionNumber++) {
                int number1 = (int) (Math.random() * 20) + 1;
                int number2 = (int) (Math.random() * 5) + 1;
                int correctAnswer = number1 / number2;

                System.out.println("Вопрос " + questionNumber + ": Сколько будет " + number1 + " / " + number2 + "?");
                int playerAnswer = scanner.nextInt();

                if (playerAnswer == correctAnswer) {
                    score += 5;
                } else {
                    score -= 5;

                }
                scanner.nextLine();

        }

            playerScores[playerIndex] = score;
        }

        for (int i = 0; i < numberPlayers - 1; i++) {
            for (int j = 0; j < numberPlayers - i - 1; j++) {
                if (playerScores[j] < playerScores[j + 1]) {
                    String tempName = playerNames[j];
                    playerNames[j] = playerNames[j + 1];
                    playerNames[j + 1] = tempName;

                    int tempScore = playerScores[j];
                    playerScores[j] = playerScores[j + 1];
                    playerScores[j + 1] = tempScore;
                }
            }
        }

        // Вывод результатов
        System.out.println("Результаты опроса:");
        for (int i = 0; i < numberPlayers; i++) {
            System.out.println(playerNames[i] + " " + playerScores[i] + " очков");

        }
        System.out.println("Ура! Игра окончена. Спасибо что приняли участие!");

        scanner.close();
    }
}