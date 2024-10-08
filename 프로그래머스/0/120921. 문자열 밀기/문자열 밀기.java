class Solution {
public static int solution(String A, String B) {
		if(A.equals(B)) {
			return 0;
		}
        int answer = 0;
        int length=  A.length();
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        for (int i = 0; i < length; i++) {
			sb.insert(0,sb.charAt(length-1)+"");
			sb.delete(length, length+1);
			
			answer++;
			if(sb.toString().equals(B)) {
				
				break;
			}
			
		}
        if(answer==length) {
        	return -1;
        }
        
        return answer;
    }
}