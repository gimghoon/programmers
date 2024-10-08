class Solution {
    public static int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
			String a= array[i]+"";
			for (int j = 0; j < a.length(); j++) {
				answer+=a.charAt(j)==55?1:0;
			}
		}
        return answer;
    }
}