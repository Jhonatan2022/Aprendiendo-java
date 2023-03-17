public class bucle_divisibles { 
        public static void main(String[] args) {
     
            //Definimos la variable num, que es el número que vamos a comprobar si es divisible entre 2 y 3
            int num=1;
     
            //Definimos el bucle, incluye el 100
            while (num<=100){

                //Comprobamos si es divisible entre 2 y 3
                if (num % 2==0 || num % 3==0){
                    
                    //Imprimimos el número
                    System.out.println(num);
                }

                //Incrementamos num
                num++;
            }
        }
}
