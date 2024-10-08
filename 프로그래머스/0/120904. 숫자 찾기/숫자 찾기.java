class Solution {
     public static int solution(int num, int k) {
		 	String strnum=num+"";
		 	for (int i = 0; i < strnum.length(); i++) {
		 		if(Integer.parseInt(strnum.charAt(i)+"") ==k) {
		 			return i+1;
		 		}
			}
	        return -1;
	    }
}