class Solution {
    public int[] solution(int n) {
	int num=1;
	int[] answer =new int[(n+1)/2];
	for (int i = 0; i < answer.length; i++) {
		answer[i]=num;
		num+=2;
		
	}
        return answer;
    }
}