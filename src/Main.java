public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido(a) a ScreenMatch");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una pradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """+fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println(clasificacion);
    }
}