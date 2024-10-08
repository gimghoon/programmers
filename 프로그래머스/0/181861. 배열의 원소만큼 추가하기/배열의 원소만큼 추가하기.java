class Solution {
   public static int[] solution(int[] arr) {
       
        int sum=0;
        for(int e:arr) {
        	sum+=e;
        }
        int[] answer = new int[sum];
        int k=0;
        for (int j = 0; j < arr.length; j++) {
        	for (int i = 0; i < arr[j]; i++) {
        		answer[i+k]=arr[j];
        		
        	}
        	k+=arr[j];
			
		}
        return answer;
    }
}