import java.nio.charset.StandardCharsets;

public class CaracterASCII {
    public static String convertir(String oracion){
        String salida="";
        byte[] bytes=oracion.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < bytes.length; i++) {
            salida=salida+bytes[i]+" ";
        }
        return salida;
    }
    public static String failCon(String oracion){
        String salida="";
        for (int i = 0; i < oracion.length(); i++) {
            salida=salida+((int)oracion.charAt(i)+" ");
        }
        return salida;
    }
}
