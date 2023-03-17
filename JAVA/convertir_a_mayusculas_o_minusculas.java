// Importamos la libreria de JOptionPane
import javax.swing.JOptionPane;

public class convertir_a_mayusculas_o_minusculas {
    public static void main(String[] args) {

        // Pedimos el texto al usuario
        String texto = JOptionPane.showInputDialog(null,
                "Por favor, introduce una frase",
                "Introducción",
                JOptionPane.INFORMATION_MESSAGE);

        // Definimos la cadena resultante
        String cadenaResultante = "";

        // true = Lo pasamos todo a mayusculas
        // false= Lo pasamos todo a minusculas
        boolean isMayus;

        // Diferencia entre mayusculas y minusculas
        final int DIFERENCIA = 32;

        // Mostramos un dialogo de opciones
        String[] opciones = { "Mayusculas", "Minusculas" };

        // El usuario elige una opcion
        int eleccion = JOptionPane.showOptionDialog(null,
                "Elige tu opcion",
                "Eleccion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        // Si el usuario elige la primera opcion, isMayus sera true
        isMayus = (eleccion == JOptionPane.YES_OPTION);

        // Definimos el caracter actual
        char caracterActual;

        // Recorremos el texto
        for (int i = 0; i < texto.length(); i++) {

            // obtenemos el caracter de la pos i
            caracterActual = texto.charAt(i);

            // Si isMayus es true, pasamos todo a mayusculas
            if (isMayus) {

                // Si esta entre esos valores, lo cambia a mayucula
                // Puedes sustituir 97 por 'a' y asi con todos
                if (caracterActual >= 97 && caracterActual <= 122) {
                    cadenaResultante += (char) (caracterActual - DIFERENCIA);
                } else {
                    // Si no es un caracter alfabetico en minuscula, lo agregamos
                    // sin hacerle nada
                    cadenaResultante += caracterActual;
                }

            } else {

                // Si esta entre esos valores, lo cambia a minuscula
                // Puedes sustituir 65 por 'A' y asi con todos
                if (caracterActual >= 65 && caracterActual <= 90) {
                    cadenaResultante += (char) (caracterActual + DIFERENCIA);
                } else {
                    // Si no es un caracter alfabetico en minuscula, lo agregamos
                    // sin hacerle nada
                    cadenaResultante += caracterActual;
                }

            }
        }

        // Mostramos la cadena resultante
        JOptionPane.showMessageDialog(null,
                cadenaResultante,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
