import java.util.Arrays;

class Solution {
     public static int solution(String before, String after) {
	        String[]beforearr= before.split("");
	        String[]afterarr= after.split("");
	        Arrays.sort(beforearr);
	        Arrays.sort(afterarr);
	        int count=0;
	       for (int i = 0; i < afterarr.length; i++) {
			count+=beforearr[i].equals(afterarr[i])?1:0;
		}
	        if(count==afterarr.length) {
	        	return 1;
	        }
	        return 0;
	    }
}