class Solution {
    public int solution(int[][] dots) {
		  int answer = 0;
		  	int x= dots[0][0];
		  	int y= dots[0][1];
		  	for (int i = 0; i < dots.length; i++) {
				if(dots[i][0]!=x&&dots[i][1]!=y){
					answer=Math.abs((x-dots[i][0])*(y-dots[i][1]));
				}
			}
	        return answer;
	    }
}