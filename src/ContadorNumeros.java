import javax.swing.*;

public class ContadorNumeros {
    public static int ingresarNumeros(){
        int numero;
        int count=0;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero:"));
            count++;
        }while (numero!=-1);
        return count-1;
    }
}
