import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RelojDigital {
    public static void horaActual(){
        DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Date date=new Date();
                System.out.println(dateFormat.format(date));
            }
        },0,1000);

    }
    public static void hora() throws InterruptedException {
        DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
        while (true) {
            Date date = new Date();
            System.out.println(dateFormat.format(date));
            Thread.sleep(1000);
        }
    }
    public static void horaEjer()throws InterruptedException{
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {

            //Mostrar
            //Si es menor que 10, escribimos un cero delante
            if (horas < 10) {
                System.out.print("0");
            }
            System.out.print(horas + ":");
            if (minutos < 10) {
                System.out.print("0");
            }
            System.out.print(minutos + ":");
            if (segundos < 10) {
                System.out.print("0");
            }
            //salto de linea
            System.out.println(segundos);
            //Aumentar el tiempo
            segundos++;
            //Comprobar el tiempo
            if (segundos == 60) {
                //reinicio los segundos
                segundos = 0;
                //aumento los minutos
                minutos++;
                if (minutos == 60) {
                    //Reinicio los minutos
                    minutos = 0;
                    //Aumento las horas
                    horas++;
                    if (horas == 24) {
                        //Reinicio las horas
                        horas = 0;
                    }
                }
            }
            Thread.sleep(1000);

        }
    }
}
