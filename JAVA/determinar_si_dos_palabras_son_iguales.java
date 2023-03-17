// Importamos la clase Scanner
import java.util.Scanner;

public class determinar_si_dos_palabras_son_iguales {

    public static void main(String[] args) {

        // Creamos un scanner para leer
        Scanner sn = new Scanner(System.in);

        // Pedimos las palabras
        System.out.println("Escribe la palabra 1");
        String palabra1 = sn.next();

        System.out.println("Escribe la palabra 2");
        String palabra2 = sn.next();

        // Comparamos con el método equals
        // Con equalsIgnoreCase, no considera las mayusculas
        if (palabra1.equals(palabra2)) {

            // Imprimimos el resultado
            System.out.println("Las palabras son iguales");
        } else {
            
            // Imprimimos el resultado
            System.out.println("Las palabras no son iguales");
        }
    }
}