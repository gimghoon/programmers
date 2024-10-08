import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   public static String[] solution(String[] todo_list, boolean[] finished) {
	   		ArrayList <String> answer=new ArrayList<String>();
	   		for (int i = 0; i < finished.length; i++) {
	   			if(!finished[i]) {
	   				answer.add(todo_list[i]);
	   			}
				
			}
	   		String[] arr=answer.stream().toArray(String[]::new);
	        return    arr;
	    }
}