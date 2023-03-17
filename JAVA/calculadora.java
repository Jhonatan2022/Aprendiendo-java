// Importamos las librerias necesarias
import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
  
        //Definimos el scanner
        Scanner sc = new Scanner(System.in);

        //Definimos el locale para que el punto sea el separador decimal
        sc.useLocale(Locale.US);

        //Definimos las variables
        double operando1;
        double operando2;
        double resultado=0;
  
        //Pedimos los datos al usuario y los guardamos en las variables
        System.out.println("Escribe el primer numero");
        operando1=sc.nextDouble();
         
        System.out.println("Escribe el codigo de operacion: +, -, *, /, ^, %");
        String operacion = sc.next();
         
        System.out.println("Escribe el segundo numero");
        operando2=sc.nextDouble();
  
        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado=operando1%operando2;
                break;
        }
  
        //Imprimimos el resultado
        System.out.println( operando1+" "+operacion+" "+operando2+" = "+resultado);
    }
}