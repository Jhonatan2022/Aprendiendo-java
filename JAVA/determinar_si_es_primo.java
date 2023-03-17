
// Importamos la clase Scanner
import java.util.Scanner;

public class determinar_si_es_primo {
    public static void main(String[] args) {

        // Definimos el numero
        Scanner sc = new Scanner(System.in);

        // Pedimos el numero
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        // Un numero negativo, el 0 y el 1, son directamente no primos.
        if (numero <= 1) {
            // Mensaje de traza
            System.out.println("El numero " + numero + " no es primo");
        } else {

            // Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(numero);

            // Definimos el contador
            int contador = 0;

            // Recorremos el numero
            for (int i = raiz; i > 1; i--) {

                // Si el numero es divisible, incrementamos el contador
                if (numero % i == 0) {

                    // Incrementamos el contador
                    contador++;
                }
            }

            /*
             * Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0
             */
            // Mensaje de traza
            System.out.println(">>" + contador);

            // Controlamos en el caso de que haya una cifra o mas
            if (contador < 1) {

                // Imprimimos el resultado
                System.out.println("El numero " + numero + " es primo");
            } else {

                // Imprimimos el resultado
                System.out.println("El numero " + numero + " no es primo");
            }

        }
    }
}
