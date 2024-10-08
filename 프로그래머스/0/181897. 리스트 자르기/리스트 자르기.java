
import java.util.Arrays;
class Solution {
  	public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a= slicer[0];
        int b= slicer[1];
        int c= slicer[2];
       
        		if(n<2) {
        	return Arrays.copyOfRange(num_list, 0 ,b+1);
        }else if(n<3){
        	return Arrays.copyOfRange(num_list, a,num_list.length);
        }else if(n<4) {
        	return Arrays.copyOfRange(num_list, a, b+1);
        }else if(n<5) {
        	int [] answer= new int[(b-a)/c+1];
        	
        	for (int i = 0; i <(b-a)/c+1; i++) {
				answer[i]=num_list[a+i*c];
				}
        	return answer;
			}else{return null;}
        	
        }
}