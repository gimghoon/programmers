class Solution {
    public int[] solution(String my_string) {
	        int[] answer = new int[52];
	         
				for (int j = 97; j < 123; j++) {
					for (int i = 0; i < my_string.length(); i++) {
					answer[j-71]+=my_string.charAt(i)==j?1:0;
					}
				} 
				for (int k = 65; k < 91; k++) {
					
					for (int i = 0; i < my_string.length(); i++) {
						answer[k-65]+=my_string.charAt(i)==k?1:0;
						}
				}
			
	        return answer;
	    }
}