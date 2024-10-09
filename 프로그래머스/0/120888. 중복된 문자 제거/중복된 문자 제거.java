class Solution {
     public static String solution(String my_string) {
		  	String  [] arr= my_string.split("");
		  	String [] a= new String [arr.length];
		  	for (int i = 0; i < a.length; i++) {
				a[i]="";
			}
		  	StringBuilder sb= new StringBuilder();
		  	for (int i = 0; i < a.length; i++) {
		  		a[i]=arr[i];
		  		int count=0;
		  		
				for (String b:a) {
					
					if(b.equals(a[i])) {
						count++;
					}
				}
				if(count==2) {
					a[i]="";
				}
				
				sb.append(a[i]);
			}
		
	        
	        return sb.toString();
	    }
}