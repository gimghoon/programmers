import java.util.Arrays;
class Solution {
     public int[] solution(String my_string) {
		   int count=0;
		   for (int i = 0; i < my_string.length(); i++) {
			   count+= my_string.charAt(i)>47&& my_string.charAt(i)<58?1:0;
			
		}
	        int[] answer = new int [count];
	        int k=0;
	        for (int i = 0; i < my_string.length(); i++) {
				if(my_string.charAt(i)>47&& my_string.charAt(i)<58) {
					answer[k++]=my_string.charAt(i)-48;
				}
			}
	        Arrays.sort(answer);
	        return answer;
	    }
}