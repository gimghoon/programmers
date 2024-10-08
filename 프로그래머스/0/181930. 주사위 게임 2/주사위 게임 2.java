class Solution {
public int solution(int a, int b, int c) {
		int allDif = a+b+c;
		int twoSame=(a+b+c)*(a*a+b*b+c*c);
		int allSame=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
		int answer = 0;
		
        if (a==b) {
        	answer= (b==c)? allSame : twoSame;
        	}else if (b==c) {
        		answer= twoSame;
        			
        	}else if(c==a) {
        		answer=twoSame;
        	}else {
        		answer=allDif;
        	}
		
        return answer;
    }
}