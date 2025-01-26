package Recursion;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDuplicate(str, 0, new StringBuilder(" "), new boolean[26]);
    }

    static void removeDuplicate(String str, int i, StringBuilder newStr, boolean[] map){
        // base case
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar =  str.charAt(i);
        if(map[currentChar - 'a']){
            removeDuplicate(str, i+1, newStr, map);
        }
        else{
            map[currentChar-'a'] = true;
            removeDuplicate(str, i+1, newStr.append(currentChar), map);
        }
    }
}
