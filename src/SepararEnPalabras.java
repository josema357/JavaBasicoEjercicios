import java.util.Scanner;

public class SepararEnPalabras {
    public static void separar(){
        Scanner entrada=new Scanner(System.in);
        String cadena=entrada.nextLine();
        String[] palabras=cadena.split("\\s");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra N°"+(i+1)+": "+palabras[i]);
        }
    }
}
