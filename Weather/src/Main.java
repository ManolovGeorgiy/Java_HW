public class Main {
    public static void main(String[] args) {

        Weather weatherbox = new Weather();

        System.out.println("Weather of the Week :");

        System.out.println(weatherbox.nameOfTheDays);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature + weatherbox.charBox + "°" + " (In the shade + 27 °C)");

        System.out.println(weatherbox.nameOfTheDays2);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature2 + weatherbox.charBox + "°");

        System.out.println(weatherbox.nameOfTheDays3 + weatherbox.charBox2 + "Probability of precipitation 20 %" + weatherbox.charBox3);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature3 + weatherbox.charBox + "°");

        System.out.println(weatherbox.nameOfTheDays4 + weatherbox.charBox2 + "Partly Cloudy" + weatherbox.charBox3);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature4 + weatherbox.charBox + "°");

        System.out.println(weatherbox.nameOfTheDays5);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature5 + weatherbox.charBox + "°");

        System.out.println(weatherbox.nameOfTheDays6);
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature6 + weatherbox.charBox + "°");

        System.out.println(weatherbox.nameOfTheDays7 + "(" + "Have a great weekends" + ")");
        System.out.println(weatherbox.getNameOfThePlus + weatherbox.temperature7 + weatherbox.charBox + "°");






    }
}