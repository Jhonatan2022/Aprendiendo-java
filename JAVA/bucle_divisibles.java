public class bucle_divisibles { 
        public static void main(String[] args) {
     
            int num=1;
     
            //Definimos el bucle, incluye el 100
            while (num<=100){
                //Comprobamos si es divisible entre 2 y 3
                if (num%2==0 || num%3==0){
                    System.out.println(num);
                }
                //Incrementamos num
                num++;
            }
        }
}
