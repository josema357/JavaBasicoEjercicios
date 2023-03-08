import javax.swing.*;

enum MesesAño{
    ENERO(1,31),
    FEBRERO(2,28),
    MARZO(3,31),
    ABRIL(4,30),
    MAYO(5,31),
    JUNIO(6,30),
    JULIO(7,31),
    AGOSTO(8,31),
    SEPTIEMBRE(9,30),
    OCTUBRE(10,31),
    NOVIEMBRE(11,30),
    DICIEMBRE(12,31);

    private int numero;
    private int dias;
    private MesesAño(int nro, int dias) {
        this.numero=nro;
        this.dias=dias;
    }
    //GETTERS
    public int getNumero() {
        return numero;
    }
    public int getDias() {
        return dias;
    }
}

public class MesesInformacion {
    public static void mesInfo(){
        String mesEntrada= JOptionPane.showInputDialog(null,"Ingresa un nombre de mes","Informacion de mes",JOptionPane.PLAIN_MESSAGE);
        MesesAño mes=MesesAño.valueOf(mesEntrada.toUpperCase());
        JOptionPane.showMessageDialog(null,"Numero de orden: "+mes.getNumero()+" y tiene "+mes.getDias()+" dias.","Informacion de mes",JOptionPane.PLAIN_MESSAGE);
    }
    public static void MesesConNroDias(){
        int nroDias=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa dias (28) (30) (31)","Meses con N dias",JOptionPane.PLAIN_MESSAGE));
        MesesAño[] meses=MesesAño.values();
        for (MesesAño mes: meses) {
            MesesAño currentMes=MesesAño.valueOf(String.valueOf(mes));
            if(currentMes.getDias()==nroDias){
                System.out.println(currentMes.name()+" es el mes nro "+currentMes.getNumero()+" y tiene "+currentMes.getDias()+" dias.");
            }
        }
    }
}
