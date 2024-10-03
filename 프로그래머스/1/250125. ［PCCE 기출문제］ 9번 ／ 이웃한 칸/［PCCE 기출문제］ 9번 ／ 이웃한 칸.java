class Solution {
   public int solution(String[][] board, int h, int w) {
		int n= board.length;
		int count =0;
		int [] dh= new int [] {1,0,0,-1};
		int [] dw= new int [] {0,1,-1,0};
		for (int i = 0; i < 4; i++) {
			int h_check=h+dh[i];
			int w_check=w+dw[i];
			
			if((h_check>=0&& h_check<n)&& (w_check<n&& w_check>=0)) {
				count+=board[h][w].equals(board[h_check][w_check])?1:0;
			}
			
		}
		
		
         return count;
    }
}