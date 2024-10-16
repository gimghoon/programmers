import java.util.Arrays;
class Solution {
    public static String solution(String polynomial) {
	    
	    	int []count= new int [2];
	    	String [] arr= polynomial.split(" ");
	    	System.out.println(Arrays.toString(arr));
	    	for (int i = 0; i < arr.length; i++) {
				if(arr[i].charAt(arr[i].length()-1)==120) {
					if(arr[i].length()==1) {
						count[0]+=1;
						continue;
					}
					count[0]+=Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
				}else if(arr[i].charAt(0)!=43) {
					count[1]+=Integer.parseInt(arr[i].substring(0,arr[i].length()));
				}
			}
	    	System.out.println(count[1]);
	    	System.out.println(count[0]);
	    	
	    	if(count[0]==1&&count[1]!=0) {
	    		return "x"+" + "+count[1];
	    	}
	    	if(count[0]==1&&count[1]==0) {
	    		return "x";
	    	}
	    	if(count[0]==0) {
	    		return count[1]+"";
	    	}
	    		
	    	if(count[1]==0) {
	    		return count[0]+"x";
	    	}
	        return count[0]+"x"+" + "+count[1];
	    }
}