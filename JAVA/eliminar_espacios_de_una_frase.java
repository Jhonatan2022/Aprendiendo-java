import javax.swing.JOptionPane;

public class eliminar_espacios_de_una_frase {
    public static void main(String[] args) {

        // pedimos el texto al usuario
        String texto = JOptionPane.showInputDialog(null,
                "Inserta una frase",
                "Inserción de texto",
                JOptionPane.INFORMATION_MESSAGE);

        // usado para almacenar el texto final
        String texto_sin_espacios = "";

        // caracter actual
        char caracterActual;

        // recorro el array
        for (int i = 0; i < texto.length(); i++) {

            // obtengo el caracter de la pos i
            caracterActual = texto.charAt(i);

            // Cuando es un espacio no lo copia a la cadena
            if (caracterActual != ' ') {

                // copio el caracter a la cadena
                texto_sin_espacios += String.valueOf(caracterActual);
            }

        }

        // Muestro el resultado
        JOptionPane.showMessageDialog(null,
                "La frase sin espacios es: " + texto_sin_espacios,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
