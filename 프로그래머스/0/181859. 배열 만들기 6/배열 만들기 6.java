import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   public static int[] solution(int[] arr) {
      
        ArrayList <Integer> stk= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
			if(stk.size()==0) {
				stk.add(arr[i]);
			}else if (stk.get(stk.size()-1)==arr[i]){
				stk.remove(stk.size()-1);
			}else {
				stk.add(arr[i]);
			}
			
		}
        int[] answer = new int[stk.size()];
        int i=0;
        for (int e: stk) {
        	answer[i]=e;
        	i++;
        }
        
        return answer.length==0?new int [] {-1}:answer;
    }
}