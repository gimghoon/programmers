class Solution {
    public static String[] solution(String[] str_list) {
	        String[] answer = {};
	        int lcount=0;
	        int rcount=0;
	        for (int i = 0; i < str_list.length; i++) {
				if (str_list[i].equals("l")) {
					lcount++;
					
				}
				if (lcount>rcount) {
					String [] lanswer=new String[i];
					for (int j = 0; j < lanswer.length; j++) {
						lanswer[j]=str_list[j];
						
					}
					return lanswer;
				}

				if (str_list[i].equals("r")) {
					rcount++;
					
				}
				
				if (lcount<rcount) {
					String [] ranswer=new String[str_list.length-i-1];
					for (int j = 0; j < ranswer.length; j++) {
						ranswer[j]=str_list[i+j+1];
						
					}
					return ranswer;
				}
			}
	        return answer;
	       
	    }
}