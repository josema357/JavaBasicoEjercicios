import javax.swing.*;

enum Dias{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}
public class DiasLaborales {
    public static void verificar(){
        String dia= JOptionPane.showInputDialog("Ingresa dia:");
        if(dia.equalsIgnoreCase(Dias.SABADO.toString())||dia.equalsIgnoreCase(Dias.DOMINGO.toString())){
            System.out.println("El "+dia.toUpperCase()+" es un dia no laborable");
        }else {
            System.out.println("El "+dia.toUpperCase()+" es un dia laborable");
        }
    }
    public static void varificarSwitch(){
        String dia= JOptionPane.showInputDialog("Ingresa dia:");
        Dias diaSem=Dias.valueOf(dia.toUpperCase());
        switch (diaSem){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia "+diaSem.name()+" es un dia laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia "+diaSem.name()+" es un dia no laborable");
                break;
        }
    }
}
