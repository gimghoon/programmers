class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int []answerList= new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
			int count=0;
			while(num_list[i]!=1) {
				if(num_list[i]%2==0) {
					num_list[i]/=2;
					count++;
				}else {
					num_list[i]= (num_list[i]-1)/2;
					count++;
				}
				
			}
			answerList[i]=count;
		}
        for(int e:answerList) {
        	answer+=e;
        }
        return answer;
    }
}