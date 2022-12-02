import java.util.Scanner;

public class numeros_aleatorios {    
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primero numero");
        int num1=sc.nextInt();
  
        System.out.println("Introduce el segundo numero");
        int num2=sc.nextInt();
        
        //Definimos cauntos numeros aleatorios queremos
        for (int i=0;i<5;i++){
            //Generamos un numero aleatorio
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }
}
