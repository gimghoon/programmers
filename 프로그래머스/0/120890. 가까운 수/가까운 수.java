class Solution {
public static int solution(int[] array, int n) {
	int min=Integer.MAX_VALUE;
    int answer = 0;
    for (int i = 0; i < array.length; i++) {
		if(Math.abs(array[i]-n)==min&&array[i]<n) {
				min=Math.abs(array[i]-n);	
				answer=array[i];
				
			}
    	if(Math.abs(array[i]-n)<min) {
			
			min=Math.abs(array[i]-n);
			answer=array[i];
		}
    	
	}
    return answer;
}
}