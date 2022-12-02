import java.util.Scanner;

public class dia_laboral {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Introduce un dia de la semana");
        String dia = sc.next();
         
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}
