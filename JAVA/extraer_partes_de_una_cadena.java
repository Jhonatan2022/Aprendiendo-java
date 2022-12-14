public class extraer_partes_de_una_cadena {
    
        public static void main(String[] args) {
           
            String cadena= "Hola mundo";
             
            //CUIDADO: es 3 porque empieza en 0 las cadenas(cuarta letra)
            //el 5 es porque siempre hay que sumarle uno, ya que sino no mostraria lo que deseamos (quinta letra) 
            String subcadena = cadena.substring(3, 6);
          
            System.out.println(subcadena);
             
        }
}
