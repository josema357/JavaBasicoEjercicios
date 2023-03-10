import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

enum DiasSemana{
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean laborable;
    private DiasSemana(boolean laborable){
        this.laborable=laborable;
    }
    @Override
    public String toString(){
        if (laborable){
            return "El dia "+ this.name().toLowerCase()+" es laborable";
        }else{
            return "El dia "+ this.name().toLowerCase()+" no es laborable";
        }
    }

}

public class DiasLaborablesDirecto {
    public static void varificar(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe un dia de la semana: ");
        String dia=entrada.nextLine();
        DiasSemana diaS=DiasSemana.valueOf(dia.toUpperCase());
        System.out.println(diaS.toString());

    }
}
