import java.util.Arrays;
class Solution {
 public static String solution(String bin1, String bin2) {
	        String answer = "";
	        String binL= bin1.length()>=bin2.length()?bin1:bin2;
	        String binS= bin1.length()<bin2.length()?bin1:bin2;
	        String [] binLarr= binL.split("");
	        String [] binSarr= binS.split("");
	        StringBuilder sb= new StringBuilder();
	        int []answerarr= new int[binL.length()+1];
	        int binLlen= binL.length();
	        int binSlen= binS.length();
	        for (int i = 0; i < binLlen; i++) {
	        	if(binSlen-i-1>=0) {
	        		if((Integer.parseInt(binLarr[binLlen-i-1]) +Integer.parseInt(binSarr[binSlen-i-1])+answerarr[i]>=2 )) {
	    				answerarr[i]=Integer.parseInt(binLarr[binLlen-i-1]) +Integer.parseInt(binSarr[binSlen-i-1])+answerarr[i]-2;
	    				answerarr[i+1]+=1;
	    			}else {
	    				answerarr[i]+=Integer.parseInt(binLarr[binLlen-i-1])+Integer.parseInt(binSarr[binSlen-i-1]);
	    			}
	        	}else {
	        		if((Integer.parseInt(binLarr[binLlen-i-1]) +answerarr[i]>=2 )) {
	    				answerarr[i]=Integer.parseInt(binLarr[binLlen-i-1]) +answerarr[i]-2;
	    				answerarr[i+1]+=1;
	    			}else {
	    				answerarr[i]+=Integer.parseInt(binLarr[binLlen-i-1]);
	    			}
	        	}
	        	
	        	
				
			}
	        
	        System.out.println(Arrays.toString(answerarr));
	        boolean flag=false;
	        for (int i = 0; i < answerarr.length; i++) {
				
				if(answerarr[answerarr.length-1-i]==0&&!flag) {
					continue;
				}else {
					flag=true;
				}
				if(flag) {
					sb.append(answerarr[answerarr.length-1-i]);
				}
			}
	       
	        return sb.toString().length()==0?"0":sb.toString();
	    }
}