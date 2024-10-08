
	class Solution {
	    public int solution(int a, int b) {
	        int num1=Integer.parseInt(""+a+b);
	        int num2= a*b*2;
	        
	    	int answer = 0;
	        answer=(num1>=num2)? num1:num2;
	        return answer;
	    }
	}

