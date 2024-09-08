class Solution {
    public int solution(String my_string, String target) {
		 	int answer=0;
	       	for (int i = 0; i < my_string.length()-target.length()+1; i++) {
				answer=my_string.substring(i,i+target.length()).equals(target)?1:0;if(answer==1) {
					break;
				}
			}
	        return answer;
	    }
}