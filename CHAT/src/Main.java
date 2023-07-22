import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите своё имя:");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Привет:" + name);
        System.out.println();

        System.out.print("Сколько вам лет?:");
        String yaers = scanner.nextLine();

        System.out.println();
        System.out.println("Здорово!" +  yaers  + " отличнй возраст ");
        System.out.println();


        System.out.print("Раскажите о себе:");
        String aboutOfMee = scanner.nextLine();
        System.out.println();

        System.out.println();
        System.out.println("Давайте еще немного пообщаемся");
        System.out.println();

        System.out.print("Кто ваш преподователь по Java?:");
        String teatcher = scanner.nextLine();
        System.out.println();

        System.out.print("Как вам дается обучение?:");
        String education = scanner.nextLine();
        System.out.println();

        System.out.println();
        System.out.println("Не волнуйтесь,в начале всегда тяжело,но труд и упорство помогут!");
        System.out.println("Спасибо вам за уделеное время!");

        System.out.println();










    }
}
