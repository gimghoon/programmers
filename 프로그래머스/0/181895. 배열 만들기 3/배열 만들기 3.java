import java.util.Arrays;
class Solution {
    public static int[] solution(int[] arr, int[][] intervals) {
	        int[] answer1 = {};
	        int[] answer2= {};
	        
	        answer1 =Arrays.copyOfRange(arr, intervals[0][0],intervals[0][1]+1);
	        answer2 =Arrays.copyOfRange(arr, intervals[1][0],intervals[1][1]+1);
	        int [] answer= new int [answer1.length+answer2.length];
	        
	        int length1= answer1.length;
	        int length2= answer2.length;
	        
	        System.arraycopy(answer1, 0, answer, 0, length1);
	        System.arraycopy(answer2, 0, answer, answer1.length, length2);
	        return answer;
	    }
}