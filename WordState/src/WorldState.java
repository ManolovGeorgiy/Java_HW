public class WorldState {

    boolean isWeatherGood = true;
    boolean istWeatherBad = false;
    boolean istNotRaining = true;
    boolean istRaining = false;
    boolean istSunShining = false;
    boolean istSnowy = false;
    boolean isCloudy = true;
    boolean istWindy = true;
    boolean isCold = true;

    boolean istWarm = false;


    public WorldState() {
        System.out.println("_________________________________");
        System.out.println("Задание второе:");
        System.out.println();
        System.out.println("<<<isWorldNegativelyGood>>>");
        System.out.println();

        istWeatherBad = isCold && istWindy;

        System.out.println("На улице холодно?:" + istWeatherBad);

        istWeatherBad = istSunShining && istWarm;

        System.out.println("Плохая погода сейчас:" + istWeatherBad);

        istWeatherBad = isCloudy || istSunShining;

        System.out.println("Плохая погода сейчас:" + istWeatherBad);
        System.out.println();



        System.out.println("<<<isWorldPositivelyGood>>>");
        System.out.println();

        isWeatherGood = !isCold;

        System.out.println("на улице холодно?:" + isWeatherGood);

        isWeatherGood =istSunShining && istWarm &&!istWindy;

        System.out.println("На улуце можно гулять?:" +!isWeatherGood);

        isWeatherGood = istRaining && istSnowy || !istSunShining;
        System.out.println("Можно загарать?:" + isWeatherGood);





    }
}

