class Solution {
 public static int solution(int chicken) {
    int answer =0;
    int current=chicken;
    while(current>=1) {
    	System.out.println(current);
    	answer+=current/10;
    	current=current%10+current/10;
    	if(current<10) {
    		break;
    	}
    }
    return answer;
}
}