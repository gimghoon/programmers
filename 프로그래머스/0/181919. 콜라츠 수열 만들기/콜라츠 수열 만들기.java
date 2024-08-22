import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int[] solution(int n) {
		ArrayList <Integer> colits= new ArrayList <>();
		colits.add(n);
		while(n!=1) {
			n=(n%2==0)?n/2:n*3+1;
			colits.add(n);
			
			
		}
        int[] answer = new int[colits.size()];
        for (int i = 0; i < colits.size(); i++) {
			answer[i]=colits.get(i);
		}
        
        
        return answer;
    }
}