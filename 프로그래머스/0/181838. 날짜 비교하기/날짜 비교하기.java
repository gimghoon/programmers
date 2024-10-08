class Solution {
    public int solution(int[] date1, int[] date2) {
	        
	        return date1[0]*1000+date1[1]*100+date1[2]<date2[0]*1000+date2[1]*100+date2[2]?1:0;
	    }
}