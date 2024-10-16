import java.util.Arrays;
class Solution {
    public static int[] solution(int[] numlist, int n) {
	    	
	    	double [] numlistd= new double[numlist.length];
	        for (int i = 0; i < numlist.length; i++) {
				numlistd[i]=numlist[i]<n?numlist[i]-n-0.5:numlist[i]-n;
				
			}
	        for (int i = 0; i < numlistd.length; i++) {
				numlistd[i]= Math.abs(numlistd[i]);
			}
	        Arrays.sort(numlistd);
	        
	        
	        for (int i = 0; i < numlistd.length; i++) {
				if(numlistd[i]==(int)numlistd[i]) {
					numlistd[i]+=n;
				}else {
					numlistd[i]=-numlistd[i]+n+0.5;
				}
			}
	        for (int i = 0; i < numlist.length; i++) {
				numlist[i]=(int)numlistd[i];
			}
	        
	        return numlist;
	    }
}