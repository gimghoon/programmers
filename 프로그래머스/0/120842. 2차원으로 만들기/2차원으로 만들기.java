class Solution {
      
	  public int[][] solution(int[] num_list, int n) {
		  
	        int[][] answer = new int [num_list.length/n][n];
	        int k=0;
	        for (int i = 0; i < num_list.length/n; i++) {
	        	int m=0;
	        	while(m<n){
	        		answer[i][m++]=num_list[k++];
				}
	        }
			
	        return answer;
	    }
}