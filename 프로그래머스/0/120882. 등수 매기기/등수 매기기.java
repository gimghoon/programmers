import java.util.Arrays;
class Solution {
  public static int[] solution(int[][] score) {
		 	double [][] scoredouble= new double[score.length][2];
			double[] arr = new double[score.length];
			for (int i = 0; i < score.length; i++) {
				scoredouble[i][0] =  (double)(score[i][0] + score[i][1]) / 2;
				
				arr[i] = scoredouble[i][0];
				System.out.println(arr[i]);
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 1) {
					if (arr[i] == arr[i + 1]) {
						continue;
					}
				}
				for (int j = 0; j < score.length; j++) {
					if (scoredouble[j][0] == arr[i]) {
						scoredouble[j][1] = scoredouble.length - i;
					}
				}
			}
			int []answer= new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				answer[i] = (int)scoredouble[i][1];
			}
			return answer;
		}
}