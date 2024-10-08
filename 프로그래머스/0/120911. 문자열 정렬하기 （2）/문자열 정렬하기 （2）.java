import java.util.Arrays;
class Solution {
   public static String solution(String my_string) {
        String []arr= new String[my_string.length()];
        my_string= my_string.toLowerCase();
       
        for (int i = 0; i < my_string.length(); i++) {
			arr[i]= my_string.charAt(i)+"";
	
		}
        Arrays.sort(arr);
        StringBuilder sb= new StringBuilder ();
        for(String a:arr) {
        	sb.append(a);
        }
        return sb.toString();
    }
}