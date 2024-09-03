class Solution {
   public int[] solution(int[] arr, int[][] queries) {
	        
	        for (int i = 0; i < queries.length; i++) {
				
	        	int first= queries[i][0];
	        	int last=queries[i][1];
	        	for (int j = first; j < last+1; j++) {
					arr[j]++;
				}
			}
	        return arr;
	    }
}