public class SwitchCase {

    public static void main(String[] args) {

        //La sintaxis del switch case en Java es la siguiente
        switch (expresion) {
            case valor1:
                // código a ejecutar si la expresión es igual a valor1
                break;
            case valor2:
                // código a ejecutar si la expresión es igual a valor2
                break;
            // otros casos posibles...
            default:
                // código a ejecutar si ninguno de los casos anteriores se cumple
        }

        //Ejemplo sencillo de uso del switch case en Java
        //para verificar el día de la semana según un número entero
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }


    }
}
