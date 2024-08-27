
class Solution {
  public static int solution(int a, int b, int c, int d) {
		int answer = 6;
		int p = 0;
		int q = 0;
		int r = 0;
		
		int[] arr = new int[] { a, b, c, d };
		int[] freq = new int[4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i] == arr[j]) {
					freq[i]++;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < freq.length; i++) {
			sum += freq[i];

		}
		switch (sum) {
		case 16:
			for (int i = 0; i < 4; i++) {
				if (freq[i] == 4) {
					p = arr[i];
				}
			}
			answer = p * 1111;
			break;
		case 10:
			for (int i = 0; i < 4; i++) {
				if (freq[i] == 3) {
					p = arr[i];
				}
				if (freq[i] == 1) {
					q = arr[i];
				}
			}
			answer = (int) Math.pow(10 * p + q, 2);
			break;
		case 8:
			for (int i = 0; i < 3; i++) {
				if (arr[i] != arr[i + 1]) {
					p = Math.max(arr[i], arr[i + 1]);
					q = Math.min(arr[i], arr[i + 1]);
					break;
				}
			}
			answer = (p + q) * (p - q);
			break;
		case 6:
			int[] temp = new int[2];
			int k = 0;
			for (int i = 0; i < 4; i++) {
				if (freq[i] == 1) {
					temp[k] = arr[i];
					k++;
				}
				q = temp[0];
				r = temp[1];
				if (k == 2) {
					break;
				}
			}
			answer = r * q;
			break;
		case 4:
			for (int i = 0; i < 4; i++) {
				answer = arr[i] < answer ? arr[i] : answer;
			}
			break;
		}
		return answer;
	}
	
}