import java.util.Arrays;
class Solution {

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		
		

		for (int j = 0; j < queries.length; j++) {
			answer[j]=Integer.MAX_VALUE;

			for (int i = queries[j][0]; i < queries[j][1] + 1; i++) {
				
				if (queries[j][2] < arr[i]) {
					
					answer[j]=answer[j]>arr[i]?arr[i]:answer[j];

			}
			
			// i에 해당하는값들을 arr에서 가져온다음에 k보다 큰 값을 변수에 저장해가면서 최솟값을 저장해나가는 방식은 안되는가요?

			
			
			
			
			
			
		}
			answer[j] = answer[j] == Integer.MAX_VALUE ? -1 : answer[j];}
		
		return answer;
	
	}
}