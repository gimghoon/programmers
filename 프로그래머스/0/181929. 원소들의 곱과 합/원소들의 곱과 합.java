class Solution {
    public int solution(int[] num_list) {
	        int answer = 0;
	        int sumSquare=0;
	        int product=1;
	        for (int i = 0; i < num_list.length; i++) {
	        	sumSquare +=num_list[i];
	        	product*=num_list[i];
	        	
				
			}
	        
	        
	        return (product<sumSquare*sumSquare)?1:0;
	    }
}