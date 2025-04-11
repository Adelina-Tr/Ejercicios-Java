public class Textos {

    public static void main(String [] args){

        // Este es un comentario de una sola línea que será ignorado por el compiladorCOPIAR CÓDIGO

        /* Este es un ejemplo de comentario
        de varias líneas en Java
        que será ignorado por el compilador */

        String nombre = "Alura"; //Crear un String

        //Concatenar String
        String saludo = "Hola, ";
        String nombre2 = "Alura";
        String mensaje = saludo + nombre2 + "!";
        System.out.println(mensaje);

        String saludo2 = "Hola, mi nombre es ";
        String nombre4 = "Alicia ";
        String continuacion = "y mi edad es ";
        int edad = 17;
        System.out.println(saludo2 + nombre4 + continuacion + edad);

        //Comparar String
        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        //TextBlock
        String mensaje2 = """
                  Hola, mundo !
                  Este es un Text Block.
                  El permite escribir textos com múltiples lineas
                  sin necesitar usar caracteres de escape o saltos de linea manualmente o concatenaciones.
                  """;
        System.out.println(mensaje2);

        /*Metodo format y placeholders (Marcadores de posicion)
        %s ---> cadenas
        %d ---> enteros
        %f ---> decimales
        %2f ---> decimal delimitado
        */
            String nombre3 = "Maria";
            int edad2 = 30;
            double valor = 55.9999;
            System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre3, edad2, valor));


        }

}
