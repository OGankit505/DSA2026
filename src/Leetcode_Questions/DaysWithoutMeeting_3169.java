package Leetcode_Questions;

import java.util.*;
public class DaysWithoutMeeting_3169 {
    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5,7},{1,3},{9,10}};
        System.out.println(countDays(days, meetings));

    }
    public static int countDays(int days, int[][] meetings){

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int result = 0 ;
        int start = 0;
        int end = 0;
        for(int[] meet : meetings){
           if(meet[0] > end){
               result += meet[0] - end - 1;
           }
           end = Math.max(end, meet[1]);
       }
       if(days > end){
           result += days - end;
       }
       return result;
    }
}
