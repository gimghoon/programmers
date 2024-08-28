class Solution {
    public static String solution(String my_string, int s, int e) {
	        String revers = "";
	        for (int i = e; i >=s; i--) {
				revers+= my_string.charAt(i)+"";
			}
	        System.out.println(revers);
	       
	        return  my_string.replace(my_string.substring(s,e+1), revers);
	    }
}