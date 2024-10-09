class Solution {
    public static int solution(int order) {
        int answer = 0;
        int current=order;
        int left= 0;
        while(current>1) {
        	if((current%10)%3==0&&current%10!=0) {
        		answer++;
        	}
        	current/=10;
        }
        return answer;
    }
}