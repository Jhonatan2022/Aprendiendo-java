public class transformar_a_ascii {
    public static void main(String[] args) {

        // Definimos la variable cadena, que es la cadena que vamos a convertir a ASCII
        String cadena = "Hola a todos papuchos";

        // Definimos el bucle, incluye el 100
        for (int i = 0; i < cadena.length(); i++) {

            // Hacemos un casting para convertir el char a int
            // Imprimimos el número ASCII
            System.out.print((int) cadena.charAt(i) + " ");
        }
    }
}