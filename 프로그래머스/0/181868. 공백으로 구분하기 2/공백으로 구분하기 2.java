class Solution {
   public static String[] solution(String my_string) {
		int countEmpty=0;
       String [] answer=my_string.split(" ");
       for(String e: answer) {
    	   countEmpty+=e.equals("")?1:0;
    	   
       }
       
	String [] realAnswer= new String [answer.length-countEmpty];
	int k=0;
	for (int i = 0; i < answer.length; i++) {
		if(!answer[i].equals("")) {
			realAnswer[k]=answer[i];
			k++;
		}
	}
        
        return realAnswer;
    }
}