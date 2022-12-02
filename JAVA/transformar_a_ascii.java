public class transformar_a_ascii {
    public static void main(String[] args) {
 
        String cadena="Hola a todos papuchos";
 
        for (int i=0;i<cadena.length();i++){
            //Hacemos un casting para convertir el char a int
            System.out.print((int)cadena.charAt(i)+" ");
        }
    }
}