import javax.swing.*;

public class SumaHasta {
    public static int suma(){
        int sumTotal=0;
        int numero=0;
        while (numero<=1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Suma los numeros hasta: "));
        }
        for (int i = 1; i <=numero; i++) {
            sumTotal+=i;
        }
        return sumTotal;
    }
}
