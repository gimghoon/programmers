class Solution {
  public static int[] solution(int n) {

		int countlength = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				int k = 1;
				int count = 0;
				while (k <= i) {
					if (i % k == 0) {
						count += 1;
					}
					k++;
				}
				if (count == 2) {
					countlength++;
				}

			}

		}
		System.out.println(countlength);
		int[] answer = new int[countlength];
		int m=0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				int k = 1;
				int count = 0;
				while (k <= i) {
					if (i % k == 0) {
						count += 1;
					}
					k++;
				}
				if (count == 2) {
					answer[m++]=i;
				}

			}

		}

		return answer;

	}
}