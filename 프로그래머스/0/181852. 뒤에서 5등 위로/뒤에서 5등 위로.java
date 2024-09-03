import java.util.Arrays;
class Solution {
    public static int[] solution(int[] num_list) {
		int [] answer= new int [num_list.length-5];
		Arrays.sort(num_list);
		System.arraycopy(num_list, 5, answer, 0, num_list.length-5);
		return answer;
		
		
    }
}