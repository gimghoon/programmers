class Solution {
 public String solution(String my_string, int n) {
	        StringBuilder sb= new StringBuilder();
	        for (int i = 0; i < my_string.length(); i++) {
				int k=0;
	        	while(k<n) {
	        		sb.append(my_string.charAt(i)+"");
	        		k++;
	        	}
			}
	        return sb.toString();
	    }
}