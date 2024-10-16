class Solution {
   
	    public int[] solution(String[] keyinput, int[] board) {
	    	int x=0;
	    	int y=0;
	    	for (int i = 0; i < keyinput.length; i++) {
				switch(keyinput[i]) {
				case "left":
					x--;break;
				case "right":
					x++;break;
				case "down":
					y--;break;
				case "up":
					y++;break;
				}
				if(x>board[0]/2) {
					x--;
				}else if(x<-(board[0]/2)) {
					x++;
				}
				if(y>board[1]/2) {
					
					y--;
				}else if(y<-(board[1]/2)) {
					y++;
				}
			}
	        int[] answer = new int[] {x,y};
	        return answer;
	    }
}