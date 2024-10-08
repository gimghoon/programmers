class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1=0;
        int sum2=0;
        for(int i:arr1) {
        	sum1+=i;
        }
        for(int i:arr2) {
        	sum2+=i;
        }
        if(arr1.length==arr2.length) {
        	if(sum1==sum2) {
        		return 0;
        	}
        	return sum1>sum2?1:-1;
        }else {
        	return arr1.length>arr2.length?1:-1;
        }
        
        
    }
}