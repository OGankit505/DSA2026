package Strings;

public class CountPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words, pref));

    }
    static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].equals(pref)){
                count++;
            }
        }
        return count;
    }
}
