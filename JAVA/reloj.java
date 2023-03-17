public class reloj {
 
    public static void main(String[] args) throws InterruptedException {
 
        //Variables
        int horas = 0, minutos = 0, segundos = 0;
 
        //Bucle infinito
        while (true) {
 
            //Mostrar
            //Si es menor que 10, escribimos un cero delante
            if (horas < 10) {
                System.out.print("0");
            }
 
            //Mostrar las horas
            System.out.print(horas + ":");
 
            //Si es menor que 10, escribimos un cero delante
            if (minutos < 10) {
                System.out.print("0");
            }
 
            //Mostrar los minutos
            System.out.print(minutos + ":");
 
            //Si es menor que 10, escribimos un cero delante
            if (segundos < 10) {
                System.out.print("0");
            }
 
            //salto de linea
            System.out.println(segundos);
 
            //Aumentar el tiempo
            segundos++;
 
            //Comprobar el tiempo
            if (segundos == 60) {

                //reinicio los segundos
                segundos = 0;

                //aumento los minutos
                minutos++;

                //Comprobar los minutos
                if (minutos == 60) {

                    //Reinicio los minutos
                    minutos = 0;

                    //Aumento las horas
                    horas++;

                    //Comprobar las horas
                    if (horas == 24) {

                        //Reinicio las horas
                        horas = 0;
                    }
                }
            }
 
            //Pausa de 1 segundo
            Thread.sleep(1000);
        }
    }
}