class Solution {
    public int solution(int[] num_list) {
		int listLengthUp= 0;
		int listLengthDown= 1;
		for(int i=0;i<num_list.length;i++) {
			listLengthUp+=num_list[i];
			listLengthDown*=num_list[i];
		}
		
		int answer = (num_list.length>=11)?listLengthUp:listLengthDown;
		
		return answer;
		
	}
}