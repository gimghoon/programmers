
import java.util.Arrays;
class Solution {
       public static int solution(int[] array) {
	        Arrays.sort(array);
	        int size=0;
	        int a=-1;
	        for (int i = 0; i < array.length; i++) {
				if(a!=array[i]) {
					a=array[i];
					size++;
				}
			}
	        
	        if(size==1) {
	        	return array[0];
	        }
	        int k=0;
	        int [][] answer= new int[size][2];
	        int maxvalue=0;
	        int maxvaluecount=0;
	        
	        for (int i = 0; i < array.length; i++) {
	        	if(i==0) {
	        		answer[k][0]=array[i];
	        		
	        		
	        		
	        	}
	        	else if(array[i]!=array[i-1]) {
	        	k++;
	        	answer[k][0]=array[i];
	        	
	        	}
	        	answer[k][1]++;
	        	
	        	if(maxvaluecount<=answer[k][1]) {
	        		maxvalue=answer[k][0];
	        		maxvaluecount=answer[k][1];
	        	}
	        }	        

	        
	        int count=0;
	        for (int i = 0; i < answer.length; i++) {
				count+=answer[i][1]==maxvaluecount?1:0;
			}
	        return count>=2?-1:maxvalue;
	    }
}