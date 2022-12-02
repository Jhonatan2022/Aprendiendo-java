import java.util.Scanner;

public class mayor_o_igual_que_cero {    
    public static void main(String[] args) {
  
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int codigo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor que 0");
            codigo=sc.nextInt();
        }while(codigo<=0);
  
        System.out.println(codigo);
    }
}
