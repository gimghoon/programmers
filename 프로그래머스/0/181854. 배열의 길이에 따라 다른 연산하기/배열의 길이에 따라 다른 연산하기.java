class Solution {
 public int[] solution(int[] arr, int n) {
    
    
    for (int i = arr.length-1; i >=0; i-=2) {
		arr[i]+=n;
	}
    return arr;
}
}