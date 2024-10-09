class Solution {
	public static String solution(String my_string) {
        StringBuilder sb= new StringBuilder();
        String []arr= my_string.split("");
        for (int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(0)<96) {
				
				arr[i]=arr[i].toLowerCase();
				
			}else {
				arr[i]=arr[i].toUpperCase();
			}
			sb.append(arr[i]);
		}
        
        return sb.toString();
    }
}