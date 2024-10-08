class Solution {
  public int solution(int[] common) {
		 	int bi=0;
		 	if (common[0]==0) {
		 		
		 		 if(common[1]==0) {
		 			return 0;
		 		}
		 	}else {
		 		 bi= common[1]/common[0];
		 	}
	        int answer = 0;
	        int cha =common[1]-common[0];
	        
	        
	        if (common[1]+cha==common[2]) {
	        	answer=common[0]+cha*(common.length);
	        }else {
	        	answer= (int) (common[0]*Math.pow(bi, common.length));
	        }
	        return answer;
	    }
}