class Solution {
public static int[] solution(int num, int total) {
        int firstnum=0;
        firstnum=num%2==0?(int) (total/num)+1-num/2:(int) total/num-(num/2);
		int[] answer =new int[num];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=firstnum++;
			
		}
        return answer;  
    }

}