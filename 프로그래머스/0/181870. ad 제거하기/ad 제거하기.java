import java.util.ArrayList;
import java.util.Arrays;
class Solution {
	public static String[] solution(String[] strArr) {

		ArrayList <String> arr=new ArrayList<>();
		
		
		for (int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				arr.add(strArr[i]);
			}
			

		}
		
		String [] answer=arr.toArray(new String[arr.size()]);	
		return answer;
	}
}