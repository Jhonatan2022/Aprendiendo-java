import java.util.Scanner;

public class separar_frase_en_palabras {

    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sn = new Scanner(System.in);
        
        // Hace que podamos escribir espacios en la frase y coja todo el String
        sn.useDelimiter("\n");

        // Pedimos la frase
        System.out.println("Escribe una frase");
        String frase = sn.next();

        // Divido la frase en palabras
        String palabras[] = frase.split(" ");

        // Muestro las palabras
        for (int i = 0; i < palabras.length; i++) {

            // Muestro la palabra
            System.out.println(palabras[i]);
        }

    }
}