import java.util.Arrays;
class Solution {
    public static int solution(int[] wallet, int[] bill) {
    	Arrays.sort(wallet);
    	Arrays.sort(bill);
    	
    	
    	
    	int num=0;
    	int wal_max=0;
    	int wal_min=0;
    	int bill_max=0;
    	int bill_min=0;
    	
    	while(true){
    	
    		Arrays.sort(wallet);
    		Arrays.sort(bill);
    		wal_max=wallet[1];
    		wal_min=wallet[0];
    		bill_max=bill[1];
    		bill_min=bill[0];
    		
    		if (wal_max>=bill_max &&wal_min>=bill_min) {
    			
    			return num;
    		}else {
    			bill[1]=(int) Math.floor(bill[1]/2);
    			num++;
    					}
    		
    	
    	}
        
    
    }
}