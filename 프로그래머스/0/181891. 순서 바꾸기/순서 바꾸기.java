class Solution {
   public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < num_list.length-n; i++) {
			answer[i]=num_list[n+i];
			
		}
		System.arraycopy(num_list, 0, answer, num_list.length-n, n);
		return answer;
	}
}