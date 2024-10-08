class Solution {
   	public int solution(String str1, String str2) {
		if(str1.equals(str2)) {
			return 1;
		}
		
		
       
        
        if(str1.length()-str2.length()<0) {
        	return 2;
        }
        for (int i = 0; i < str1.length()-str2.length()+1; i++) {
			if(str1.substring(i, i+str2.length()).equals(str2)) {
				return 1;
			}
		}
        return 2;
    }
}