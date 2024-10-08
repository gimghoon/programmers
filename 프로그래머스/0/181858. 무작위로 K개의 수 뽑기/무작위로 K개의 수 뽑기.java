import java.util.ArrayList;
import java.util.Arrays;

class Solution {
   public static int[] solution(int[] arr, int k) {
		int [] answer= new int[k];
		ArrayList <Integer> result=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        	
			if(result.indexOf(arr[i])!=-1) {
				continue;
			}
				
			result.add(arr[i]);
        }	 
        
        	
        System.out.println(result);
        if(result.size()<k) {
        for (int i = 0; i < result.size(); i++) {
			answer[i]= result.get(i);
		}
         
        	for (int i = result.size(); i < answer.length; i++) {
				answer[i]=-1;
			}
        }else {
        	for (int i = 0; i < answer.length; i++) {
				answer[i]=result.get(i);
			}
        	
        }
        return answer;
    
	
}
}