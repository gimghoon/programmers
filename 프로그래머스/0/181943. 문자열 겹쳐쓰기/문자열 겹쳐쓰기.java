

public class Solution {
	     public String solution(String my_string, String overwrite_string, int s) {
        
        
    	String answer = "";
    	
    	answer= my_string.substring(0,s);
    	answer= answer.concat(overwrite_string);
    	if (my_string.length()>overwrite_string.length()+s) {
    		answer=answer.concat(my_string.substring(s+overwrite_string.length(),my_string.length()));
    	}else {
    		
    	}
    	
    	
    	return answer;
    }
   
	}

