import java.util.Arrays;
class Solution {
    public static String solution(String s) {
		 
		 
		 	
		 	int countonly=0;
		 	for (int i = 0; i < s.length(); i++) {
		 		int count=0;
				String k= s.charAt(i)+"";
				for (int j = 0; j < s.length(); j++) {
					if((s.charAt(j)+"").equals(k) ) {
						count++;
						
					}
				}
				System.out.println(k);
				System.out.println(count);
				if(count==1) {
					countonly++;
				}
				
			}
		 	
		 	String [] answerarr=new String [countonly];
		 	int m=0;
		 	for (int i = 0; i < s.length(); i++) {
		 		int count=0;
				String k= s.charAt(i)+"";
				for (int j = 0; j < s.length(); j++) {
					if((s.charAt(j)+"").equals(k) ) {
						count++;
						
					}
				}
				System.out.println(k);
				System.out.println(count);
				if(count==1) {
					answerarr[m++]=k;
				}
				
			}
		 	StringBuilder sb= new StringBuilder();
		 	Arrays.sort(answerarr);
		 	for (String i: answerarr) {
				sb.append(i);
			}
		 	
		 	
		 	
	        return sb.toString();
	    }
}