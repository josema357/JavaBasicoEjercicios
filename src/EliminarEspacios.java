import javax.swing.*;
import java.util.Scanner;

public class EliminarEspacios {
    public static String eliminar(){
        Scanner entrada=new Scanner(System.in);
        String frase= entrada.nextLine();
        String salida=frase.replace(" ","");
        JOptionPane.showInputDialog(null,"La frase sin espacios es "+salida,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        return salida;
    }
}
