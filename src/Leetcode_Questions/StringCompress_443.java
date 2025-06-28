package Leetcode_Questions;

public class StringCompress_443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }

    static int compress(char[] chars)
    {
        int n = chars.length;
        int index = 0;
        int i = 0;

        while(i<n){
            char current = chars[i];
            int count =0;

            while(i<n && chars[i] == current){
                count++;
                i++;
            }

            chars[index] = current;
            index++;

            if(count > 1){
                String count_str = String.valueOf(count);
                for(char ch : count_str.toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}
