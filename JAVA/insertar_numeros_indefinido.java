import java.util.Scanner;

public class insertar_numeros_indefinido {
    public static void main(String[] args) {
        
        //Pedimos el numero
       Scanner sn=new Scanner(System.in);
       int num=sn.nextInt();
        
       int contador=0;
        
       //Hasta que no se introduzca -1 no se sale
       while(num!=-1){
            
           contador++;

           System.out.println("Introduce -1 para terminar ");
           num=sn.nextInt(); //Pedimos de nuevo el número
            
       }
         
       System.out.println("Fin, se han introducido "+contador+" numeros en total.");        
    }
}
