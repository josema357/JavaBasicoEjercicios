
public class Numero_Primo {
    boolean esPrimo=true;
    public String verificarPrimo(double num){
        int ra=(int)Math.sqrt(num);
        for (int i=ra;i>1;i--){
            if((int)num % i == 0){
                this.esPrimo=false;
                break;
            }
        }
        if (this.esPrimo){
            return "El numero es primo";
        }else {
            return "El numero no es primo";
        }
    }
}
