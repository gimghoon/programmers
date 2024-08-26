
import java.math.BigInteger;
import java.util.Arrays;
class Solution {
   public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        BigInteger denom3= BigInteger.valueOf(denom1*denom2);
	        BigInteger numer3=BigInteger.valueOf(numer1*denom2+ numer2*denom1);
	        int dcb_dn= denom3.gcd(numer3).intValue();
	        answer[0]=(numer1*denom2+ numer2*denom1)/dcb_dn;
	        answer[1]=(denom1*denom2)/dcb_dn;
	        
	        return answer;
	    }
}