class Solution {
   	public static int solution(int i, int j, int k) {
        int answer = 0;
        int countnum=k+48;
        for (int l = i; l < j+1; l++) {
			String s=l+"";
			for (int m = 0; m < s.length(); m++) {
				answer+=s.charAt(m)==countnum?1:0;
			}
		}
        
        return answer;
    }
}