public class numeros_primos {
    public static void main(String[] args) {
  
        //Hacemos un bucle para recorrer los numeros del 1 al 100
        for (int i=1;i<=100;i++){

            //Hacemos un casting para que nos devuelva un numero entero
            int raiz=(int)Math.sqrt(i);
            int contador=0;
  
            //Hacemos otro bucle para contar los divisibles
            for (int j=raiz;j>1;j--){

                //Si el numero es divisible, aumentamos el contador
                if ( i% j==0 ){

                    //Aumentamos el contador
                    contador++;
                }
            }
  
            /*Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0*/
            if (contador<1){

                //Mostramos el numero
                System.out.println(i);
            }
  
        }
    }
}
