public class fizzfuzz {
    
    public static void main(String[] args) {
        
        // Creamos el bucle
        for (int i = 1; i <= 100; i++) {
            
            // Comprobamos si es divisible entre 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {

                // Mostramos el resultado
                System.out.println(i + "  FizzFuzz");
            }
            
            // Comprobamos si es divisible entre 3
            else if (i % 3 == 0) {

                // Mostramos el resultado
                System.out.println(i + "  Fizz");
            }
            
            // Comprobamos si es divisible entre 5
            else if (i % 5 == 0) {

                // Mostramos el resultado
                System.out.println(i + "  Fuzz");
            }
            
            // Si no es divisible entre 3 ni 5
            else {

                // Mostramos el resultado
                System.out.println(i);
            }
        }
    }
}
