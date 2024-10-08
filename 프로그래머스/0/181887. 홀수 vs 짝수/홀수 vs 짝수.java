class Solution {
  public int solution(int[] num_list) {
	        int answereven = 0;
	        int answerodd = 0;
	        for (int i = 0; i < num_list.length; i++) {
				answereven+=i%2==0?num_list[i]:0;
				answerodd+=i%2==1?num_list[i]:0;
				
			}
	        return Math.max(answereven,answerodd);
	    }
}