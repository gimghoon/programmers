class Solution {
    public int solution(int a, int d, boolean[] included) {
			int a_number=0;
			int d_number=0;
			for (int i = 0; i < included.length; i++) {
				if (included[i]) {
					a_number+=1;
					d_number+=i;
					
				} else {

					
				}
				
			}
			
			
	        int answer = a_number*a+d_number*d;
	        return answer;
	    }
}