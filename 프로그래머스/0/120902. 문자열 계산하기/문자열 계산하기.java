class Solution {
   public static int solution(String my_string) {
        int answer=0;
    	String []str= new String[my_string.split(" ").length];
    	str=my_string.split(" ");
    	for (int i = 0; i < str.length; i+=2) {
					if(i==0) {
						answer+=Integer.parseInt(str[i]);
						continue;
					}
					if(str[i-1].equals("+")) {
						answer+= Integer.parseInt(str[i]);
			        }else {
			        	answer-= Integer.parseInt(str[i]);
			        }
		}
        return answer;
        
    }
}