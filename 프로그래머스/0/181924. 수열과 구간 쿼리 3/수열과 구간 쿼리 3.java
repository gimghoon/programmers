class Solution {
    	public int[] solution(int[] arr, int[][] queries) {
		
		for (int k = 0; k < queries.length; k++) {
			int temp = arr[queries[k][0]];
			arr[queries[k][0]]=arr[queries[k][1]];
			arr[queries[k][1]]=temp;
		}
		
		return arr;
	}
}