import java.util.Arrays;
class Solution {
 public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		

		for (int j = 0; j < queries.length; j++) {
			int[] num = new int[queries[j][1] - queries[j][0] + 1];

			for (int i = queries[j][0]; i < queries[j][1] + 1; i++) {
				if (queries[j][2] < arr[i]) {
					num[i - queries[j][0]] = arr[i];
				} else {
					num[i - queries[j][0]] = Integer.MAX_VALUE;
				}

			}

			
			
			Arrays.sort(num);
			answer[j]=num[0];
			
			answer[j] = answer[j] == Integer.MAX_VALUE ? -1 : num[0];
		}
		
		return answer;
	}
}