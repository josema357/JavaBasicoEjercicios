import java.util.Scanner;

public class ExtraerLetra {
    public static String extraer(){
        Scanner entrada=new Scanner(System.in);
        String cadena=entrada.next();
        return cadena.substring(3,5);
    }
}
