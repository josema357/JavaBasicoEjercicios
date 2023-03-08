public class ContarVocales {
    int count=0;
    public int contar(String frase){

        for (int i = 0; i < frase.length(); i++) {
            char letra=frase.charAt(i);
            if(Character.toString(letra).matches("[aA]")||
                    Character.toString(letra).matches("[eE]")||
                    Character.toString(letra).matches("[iI]")||
                    Character.toString(letra).matches("[oO]")||
                    Character.toString(letra).matches("[uU]")){
                this.count++;
            }
        }
        return this.count;
    }
}
