import java.util.Scanner;

public class insertar_numeros_indefinido {
    public static void main(String[] args) {

        // Pedimos el numero
        Scanner sn = new Scanner(System.in);
        // Pedimos el numero
        int num = sn.nextInt();

        // Contador de numeros introducidos
        int contador = 0;

        // Hasta que no se introduzca -1 no se sale
        while (num != -1) {

            // Aumentamos el contador
            contador++;

            // Pedimos de nuevo el número
            System.out.println("Introduce -1 para terminar ");
            num = sn.nextInt(); 
        }
        
        // Mostramos el resultado
        System.out.println("Fin, se han introducido " + contador + " numeros en total.");
    }
}
