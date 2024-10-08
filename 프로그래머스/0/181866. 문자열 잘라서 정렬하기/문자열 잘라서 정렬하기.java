import java.util.Arrays;
class Solution {
  public static String[] solution(String myString) {

		String[] answer = myString.split("x");
//        answer= Arrays.stream(answer).filter(str->!str.isEmpty()).toArray(String[]::new);
		
		Arrays.sort(answer);
		int countempt = 0;
		for (String s : answer) {
			countempt += s.equals("") ? 1 : 0;
		}
		String[] realanswer = new String[answer.length - countempt];
		int m=0;
		for (int i = 0; i < answer.length; i++) {
			if(answer[i].equals("")) {
				continue;
			}else {
				realanswer[m++]=answer[i];
			}
		}
		return realanswer;
	}
}