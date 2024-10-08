class Solution {
 public int[] solution(int n, int[] numlist) {
		 int count=0;
		 for (int i :numlist) {
			 count+=i%n==0?1:0;
		 }
	        int[] answer = new int[count];
	      int k=0;
	        for (int i :numlist) {
	        	if(i%n==0) {
	        		answer[k++]=i;
	        	}
	        }
	        return answer;
	    }
}