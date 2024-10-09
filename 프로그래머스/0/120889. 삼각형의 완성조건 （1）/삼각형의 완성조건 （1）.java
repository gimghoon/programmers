class Solution {
   public int solution(int[] sides) {
		int max=0;
		int maxindex=0;
		for (int i = 0; i < sides.length; i++) {
			if(max<sides[i]) {
				max=sides[i];
				maxindex=i;
			}
		}
		int answer=0;
		for (int i = 0; i < sides.length; i++) {
		answer+=i==maxindex?sides[i]:-sides[i];
		}
		if(answer<0) {
			return 1;
		}else {
			return 2;
		}

	}
}