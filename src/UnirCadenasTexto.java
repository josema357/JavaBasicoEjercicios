import javax.swing.*;

public class UnirCadenasTexto {
    public static String unirtextos(){
        String resultado= "";
        String nuevoTexto;
        do{
            nuevoTexto= JOptionPane.showInputDialog(null,"Ingresa Cadenas de texto (Para salir pulsa Enter)","Unir Cadenas",JOptionPane.INFORMATION_MESSAGE);
            resultado+=" "+nuevoTexto;
        }while (!(nuevoTexto.equals("")));
        return resultado;
    }
}
