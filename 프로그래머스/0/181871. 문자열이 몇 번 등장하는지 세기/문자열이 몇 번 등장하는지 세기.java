class Solution {
    public static int solution(String myString, String pat) {
		int count=0;
		for (int i = 0; i < myString.length()-pat.length()+1; i++) {
			
			count+=myString.substring(i,i+pat.length()).equals(pat)?1:0;
		}
		return count;
		
    }
}