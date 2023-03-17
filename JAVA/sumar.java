// ImPORTANTE: El nombre del archivo debe ser el mismo que el nombre de la clase
import java.util.Scanner;
import java.util.Scanner;

public class sumar {
    public static void main(String[] args) {

        // Creamos el Scanner
        System.out.println("Bienvenido a este simple programa que sumara lso números que ingreses");
        Scanner s= new Scanner(System.in);

        // Pedimos los números
        int a,b,c = 0;

        // Pedimos el primer número
        System.out.println("Introduce un número: ");
        a = s.nextInt(); 

        // Pedimos el segundo número
        System.out.println("Introduce el segundo número: ");
        b = s.nextInt();

        // Mostramos el resultado
        c = a + b;
        System.out.println("El resultado de su suma es: " + c);
    }
}
