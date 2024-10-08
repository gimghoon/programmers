class Solution {
   	public static int[] solution(int[] arr, boolean[] flag) {
		int size = 0;
		int answersize=0;
		for (int i = 0; i < flag.length; i++) {
			size += flag[i] ? arr[i] * 2 : 0;
			answersize += flag[i] ? arr[i] * 2 : -arr[i];
		}
		int[] answertmp = new int[size];
		int k = 0;
		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					answertmp[k] = arr[i];
					k++;
				}
			}else {
				k=Math.max(0,k-arr[i]);
			}
		}
		int[ ]answer= new int [answersize];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i]=answertmp[i];
		}

		return answer;
	}
}
