public class ReemplazarLetra {
    public static String cambiar(String oracion){
        char[] chars=oracion.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.toString(chars[i]).matches("[aA]")){
                switch (chars[i]){
                    case 'a':
                        chars[i]='e';
                        break;
                    case 'A':
                        chars[i]='E';
                        break;
                }
            }
        }
        return String.valueOf(chars);
    }
    public static String facil(String oracion){
        String reemMinusculas=oracion.replace('a','e');
        return reemMinusculas.replace('A','E');
    }
}
