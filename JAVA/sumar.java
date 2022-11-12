import java.util.Scanner;
import java.util.Scanner;

public class sumar {
    public static void main(String[] args) {
        System.out.println("Bienvenido a este simple programa que sumara lso números que ingreses");
        Scanner s= new Scanner(System.in);

        int a,b,c = 0;

        System.out.println("Introduce un número: ");
        a = s.nextInt(); 

        System.out.println("Introduce el segundo número: ");
        b = s.nextInt();

        c = a + b;
        System.out.println("El resultado de su suma es: " + c);
    }
}
