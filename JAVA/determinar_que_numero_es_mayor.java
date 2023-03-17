public class determinar_que_numero_es_mayor {

    public static void main(String[] args) {

        // Declaramos las variables
        int num1 = 3;
        int num2 = 5;

        // Hacemos la comprobación
        if (num1 >= num2) {

            // Si son iguales los mostramos
            if (num1 == num2) {

                // Imprimimos el resultado
                System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");
            } else {

                // Imprimimos el resultado
                System.out.println("El número " + num1 + " es mayor que el número " + num2);
            }
        } else {

            // Imprimimos el resultado
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        }
    }
}