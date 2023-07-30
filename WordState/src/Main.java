public class Main {
    public static void main(String[] args) {

        //Задание 1 :

        int a = 33;
        int b = 48;
        int change;

        System.out.println("Задание Первое:");
        System.out.println();
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
        change = b;
        b = a;
        a = change;
        System.out.println("a = " + a + " b = " + b);
        System.out.println();

        int c = 88;
        int d = 15;
        System.out.println("c = " + c + " d = " + d);
        System.out.println();
        c += d;
        d = c - d;
        c -= d;
        System.out.println("c = " + c + " d = " + d);
        System.out.println();

        // Задание 2 :


        WorldState worldState = new WorldState();



    }
}