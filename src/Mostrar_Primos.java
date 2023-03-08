public class Mostrar_Primos {
    public void mostrar(){
        for (int i = 1; i <=100 ; i++) {
            Numero_Primo verificar=new Numero_Primo();
            String response=verificar.verificarPrimo((double)i);
            if(response.equals("El numero es primo")){
                System.out.print(i+" ");
            }
        }
    }
}
