

class Solution {
    public int solution(int a, int b) {
    	String stra= ""+a;
    	String strb= ""+b;
    	String str1=stra+strb;
    	String str2=strb+stra;
    	
    	
        int answer = 0;
        answer = (Integer.parseInt(str1)>=Integer.parseInt(str2))?Integer.parseInt(str1):Integer.parseInt(str2);
        return answer;
    }
}
