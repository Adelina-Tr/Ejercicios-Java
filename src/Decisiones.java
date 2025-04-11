public class Decisiones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //Prueba de operadores relacionale
//        if(fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else{
//            System.out.println("Peliculas retro que aun vale la pena ver");
//        }

        if(incluidoEnElPlan || tipoPlan.equals("plus")){//Testear con && y con otros valores
            System.out.println("Que disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no dispoonible para su plan actual");
        }

    }
}
