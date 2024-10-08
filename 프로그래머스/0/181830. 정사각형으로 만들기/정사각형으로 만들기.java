class Solution {
 public int[][] solution(int[][] arr) {
	int rownum= arr.length;
	int columnum= arr[0].length;
	int answernum= Math.max(rownum, columnum);
    int[][] answer = new int [answernum][answernum];
   for (int i = 0; i < rownum; i++) {
	for (int j = 0; j < columnum; j++) {
		answer[i][j]=arr[i][j];
	}
   }
   return answer;
}
}