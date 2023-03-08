import javax.swing.*;

public class Calculadora {
    public static String calcular(){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa 1er numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa 2do numero"));
        String signo=JOptionPane.showInputDialog("Ingresa signo (+)(-)(*)(/)(^)(%)");

        switch (signo){
            case "+":
                return (""+(num1+num2));
            case "-":
                return ""+(num1-num2);
            case "*":
                return ""+(num1*num2);
            case "/":
                return ""+(num1/num2);
            case "^":
                return ""+(Math.pow((double) num1,(double) num2));
            case "%":
                return ""+(num1%num2);
            default:
                return "Ingresa numeros enteros y un signo corerecto";
        }
    }
}
