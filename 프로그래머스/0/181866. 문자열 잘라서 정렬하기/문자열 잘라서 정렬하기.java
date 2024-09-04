import java.util.Arrays;
class Solution {
  public static String[] solution(String myString) {
		
		
		
		
        String[] answer = myString.split("x");
        answer= Arrays.stream(answer).filter(str->!str.isEmpty()).toArray(String[]::new);
        	Arrays.sort(answer);
        return answer;
    }
}