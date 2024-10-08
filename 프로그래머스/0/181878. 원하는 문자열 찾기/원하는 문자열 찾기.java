class Solution {
   
	    public int solution(String myString, String pat) {
	        int answer = 0;
	        String lower_mystring= myString.toLowerCase();
	        String lower_pat= pat.toLowerCase();
	        for(int i=0;i<lower_mystring.length()-lower_pat.length()+1;i++) {
	        	answer=	lower_pat.equals(lower_mystring.substring(i,i+lower_pat.length()))?1:0;
	        	if (answer==1) {
	        		break;
	        	}
	        }
	        
	        return answer;
	    }
    }
