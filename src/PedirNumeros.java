import javax.swing.*;

public class PedirNumeros {
    public static void resultados(){
        double numero;
        double numMayor=0;
        double numMenor=0;
        double sumTotal=0;
        double sumPositivo=0;
        double sumNegativo=0;
        double mediaSumTotal;
        int count=0;
        do{
            numero= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un numero (Salir >>> \"-1\")","Resultados",JOptionPane.PLAIN_MESSAGE));
            if(numero>numMayor){
                numMayor=numero;
            }
            if(numero<numMenor & numero!=-1){
                numMenor=numero;
            }
            if(numero!=-1){
                sumTotal+=numero;
            }
            if(numero>=0){
                sumPositivo+=numero;
            }
            if(numero<-1){
                sumNegativo+=numero;
            }
            if(numero!=-1){
                count++;
            }
        }while(numero!=-1);

        mediaSumTotal=sumTotal/count;

        System.out.println("Numero mayor: "+numMayor);
        System.out.println("Numero menor: "+numMenor);
        System.out.println("Suma total: "+sumTotal);
        System.out.println("Suma total positivos: "+sumPositivo);
        System.out.println("Suma total negativos: "+sumNegativo);
        System.out.println("Media de la suma total: "+mediaSumTotal);
    }
}
