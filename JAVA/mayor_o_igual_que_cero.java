import java.util.Scanner;

public class mayor_o_igual_que_cero {    
    public static void main(String[] args) {
  
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int codigo;

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos el numero
        do{

            // Pedimos el numero
            System.out.println("Introduce un numero mayor que 0");
            codigo=sc.nextInt();

        // Si el numero es menor que 0, mostramos un mensaje de error
        }while(codigo<=0);
  
        // Mostramos el resultado
        System.out.println(codigo);
    }
}
