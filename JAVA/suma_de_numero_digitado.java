import java.util.Scanner;

public class suma_de_numero_digitado {
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sn = new Scanner(System.in);

        // Pedimos el primer número
        System.out.println("Inserta un numero entero mayor que 1");
        int num;

        // Comprobamos que el número sea mayor que 1
        do {

            // Pedimos el primer número
            num = sn.nextInt();

            // Si el número es menor que 1, mostramos un mensaje de error
            if (num <= 1) {

                // Mostramos el resultado
                System.out.println("Error. No has introducido un valor correcto."
                        + "Vuelve a intentarlo");
            }

            // Condición para salir
        } while (!(num >= 1));

        // Declaramos la variable suma
        int suma = 0;

        // Realizamos la suma
        for (int contador = 1; contador <= num; contador++) {

            // Sumamos los numeros
            suma += contador;
        }

        // Mostramos el resultado
        System.out.println("La suma desde el 1 hasta el " + num + " es: " + suma);
    }
}
