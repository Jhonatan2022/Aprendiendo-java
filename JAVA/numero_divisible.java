import java.util.Scanner;
public class numero_divisible {
  
    public static void main(String[] args) {
  
        //Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos el numero
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
  
        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (numero%2==0){

            //Mostramos el resultado
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{

            //Mostramos el resultado
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
}