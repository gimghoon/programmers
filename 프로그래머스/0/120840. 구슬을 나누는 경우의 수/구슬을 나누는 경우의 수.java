class Solution {

	public int solution(int balls, int share) {
		  
		  	double answer=1;
	        while(share>0) {
	        	answer*=(double)balls--/share--;
	        	
	        }
	         return (int)Math.round(answer);
	    }
}