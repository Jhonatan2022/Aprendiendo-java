public class contador_de_vocales {
        public static void main(String[] args) {
      
            //Definimos la cadena
            String cadena="Hola a todos papuchos";
            
            //Definimos el contador de vocales
            int contador=0;

            //Recorremos la cadena  
            for (int i=0; i < cadena.length(); i++){

                //Comprobamos si el caracter es una vocal
                //Si lo es, sumamos 1 al contador
                if(cadena.charAt(i)=='a' || 
                        cadena.charAt(i)=='e' || 
                        cadena.charAt(i)=='i' || 
                        cadena.charAt(i)=='o' || 
                        cadena.charAt(i)=='u'){
                            
                    //Sumamos 1 al contador
                    contador++;
                }
            }

            //Imprimimos el resultado
            System.out.println("Hay "+contador+" vocales");
        }
}
