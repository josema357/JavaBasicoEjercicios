import javax.swing.*;

public class MinusculasMayusculas {
    public static String elige(){
        String frase= JOptionPane.showInputDialog(null,"Ingresa la frase","Datos",JOptionPane.INFORMATION_MESSAGE);
        String eleccion;
        do{
            eleccion=JOptionPane.showInputDialog(null, "Convertir a minusculas(m) mayusculas(M)","Convertir",JOptionPane.INFORMATION_MESSAGE);
        }while (eleccion.equals("m")==false && eleccion.equals("M")==false);
        if(eleccion.equals("m")){
            return frase.toLowerCase();
        }else{
            return frase.toUpperCase();
        }
    }
    public static String eligePanel(){
        String[] opciones={"Mayusculas","Minusculas"};
        boolean isMayus;
        String frase= JOptionPane.showInputDialog(null,
                "Ingresa la frase",
                "Datos",
                JOptionPane.INFORMATION_MESSAGE);
        int eleccion=JOptionPane.showOptionDialog(null,
                "Elige tu opcion",
                "Eleccion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        isMayus=(eleccion==JOptionPane.YES_NO_OPTION);
        if(isMayus){
            return frase.toUpperCase();
        }else{
            return frase.toLowerCase();
        }
    }
}
