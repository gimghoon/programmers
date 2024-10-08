class Solution {
  public static int solution(int n) {
		String ns= n+"";
		int answer = 0;
		for (int i = 0; i < ns.length(); i++) {
			answer+=Integer.parseInt(ns.charAt(i)+"");
		}
        return answer;
    }
}