public class Conversor {

    public static void main(String[] src){

        double temperatuaEnCelcius = 55.44;
        System.out.println(temperatuaEnCelcius);

        double temperaturaEnFahrenheit = (temperatuaEnCelcius * 1.8) + 32;
        System.out.println(temperaturaEnFahrenheit);

        int FahrenheitInt = (int) temperaturaEnFahrenheit;
        System.out.println(FahrenheitInt);

    }
}
