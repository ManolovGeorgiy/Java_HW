import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text =  ("I dont give a fuck");
        String text1 =  ("bullshit");
        String text2 =  ("you are asshole");

        String TextMessage = text.replace("fuck", "fk");
        String TextMessage1 = text1.replace("bullshit","b****t");
        String TextMessage2 = text2.replace("asshole","as***le");

        System.out.println(TextMessage);
        System.out.println();
        System.out.println(TextMessage1);
        System.out.println();
        System.out.println(TextMessage2 + "." + TextMessage);
        System.out.println();
    }
}