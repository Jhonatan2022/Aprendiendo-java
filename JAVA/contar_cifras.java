import java.util.Scanner;

public class contar_cifras {
    public static void main(String[] args) {

        // Definimos el numero
        Scanner sc = new Scanner(System.in);

        // Controlamos que el numero sea positivo
        int numero = 0;

        // Controlamos que el numero sea positivo
        do {
            // Pedimos el numero
            System.out.println("Introduce un numero");
            numero = sc.nextInt();

        
        } while (numero < 0);

        // Definimos el contador
        int contador = 0;

        // Recorremos el numero
        for (int i = numero; i > 0; i /= 10) {

            // Incrementamos el contador
            contador++;
        }

        // Controlamos en el caso de que haya una cifra o mas
        if (contador == 1) {
            // Imprimimos el resultado
            System.out.println("El numero " + numero + " tiene " + contador + " cifra");
        } else {
            // Imprimimos el resultado
            System.out.println("El numero " + numero + " tiene " + contador + " cifras");
        }
    }
}
