class Solution {
//    public static int solution(int[][] board) {
// 		int countmine=0;
// 		for (int i = 0; i < board.length; i++) {
// 			for (int j = 0; j < board.length; j++) {
// 				countmine+=board[i][j]==1?1:0;
// 			}
// 		}
// 		System.out.println(countmine);
//         int answer = (int) Math.pow(board.length, 2);
//         int [][]mine= new int [countmine][2];
//         int m=0;
//         for (int i = 0; i < board.length; i++) {
// 			for (int j = 0; j < board.length; j++) {
// 				if(board[i][j]==1) {
// 					mine[m][0]=j;
// 					mine[m][1]=i;
// 					m++;
					
// 				}
// 			}
// 		}
        
//         for (int i = 0; i < mine.length; i++) {
// 			int x=mine[i][0];
// 			int y=mine[i][1];
// 			int len= mine.length;
// 			 if(x==0&&y==0) {
// 				 board[y][x+1]=1;
// 				 board[y+1][x]=1;
// 				 board[y+1][x+1]=1;
				 
// 			 }
// 			 else if(x==len-1&&y==len-1) {
// 				 board[y][x-1]=1;
// 				 board[y-1][x]=1;
// 				 board[y-1][x-1]=1;
// 			 }
// 			 else if(x==len-1&&y==0) {
// 				 board[y][x-1]=1;
// 				 board[y+1][x-1]=1;
// 				 board[y+1][x]=1;
// 			 }
// 			 else if(x==0&&y==len-1) {
// 				 board[y-1][x]=1;
// 				 board[y-1][x+1]=1;
// 				 board[y][x+1]=1;
// 			 }
// 			 else if((x<len-1&&x>0)&&y==len-1) {
// 				 board[y][x-1]=1;
// 				 board[y-1][x-1]=1;
// 				 board[y-1][x]=1;
// 				 board[y-1][x+1]=1;
// 				 board[y][x+1]=1;
// 			 }
// 			 else if((x<len-1&&x>0)&&y==0) {
// 				 board[y][x-1]=1;
// 				 board[y+1][x-1]=1;
// 				 board[y+1][x]=1;
// 				 board[y+1][x+1]=1;
// 				 board[y][x+1]=1;
// 			 }
// 			 else if(x==0&&(y<len-1&&y>0)) {
// 				 board[y-1][x]=1;
// 				 board[y-1][x+1]=1;
// 				 board[y][x+1]=1;
// 				 board[y+1][x+1]=1;
// 				 board[y+1][x]=1;
// 			 }
// 			 else if(x==len-1&&(y<len-1&&y>0)) {
				 
// 				board[y-1][x]=1;
// 				board[y-1][x-1]=1;
// 				board[y][x-1]=1;
// 				board[y+1][x-1]=1;
// 				board[y+1][x]=1;
// 			 }else {
// 				 board[y-1][x-1]=1;
// 				 board[y][x-1]=1;
// 				 board[y+1][x-1]=1;
// 				 board[y-1][x]=1;
// 				 board[y+1][x]=1;
// 				 board[y-1][x+1]=1;
// 				 board[y][x+1]=1;
// 				 board[y+1][x+1]=1;
				
// 			 }
			 
			
// 		}
        
//         for (int i = 0; i < board.length; i++) {
//         	for (int j = 0; j < board.length; j++) {
// 				answer-=board[i][j]==1?1:0;
// 			}
			
// 		}
       
        
//         return answer;
//     }
      public int solution(int[][] board) {
        int rows = board.length;  // 보드의 행 수
        int cols = board[0].length;  // 보드의 열 수
        
        int safeCount = 0;  // 안전한 칸의 수를 저장할 변수
        
        // 보드의 각 칸을 순회
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 현재 칸이 안전한 칸인지 확인
                if (isSafe(board, i, j)) {
                    safeCount += 1;  // 안전한 칸이라면 결과값을 증가
                }
            }
        }
        
        return safeCount;  // 최종 안전한 칸의 수를 반환
    }
    
    // 현재 위치가 안전한 칸인지 확인하는 메서드
    public boolean isSafe(int[][] board, int row, int col) {
        // 현재 위치 주변의 8개 칸을 검사
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                try {
                    // 인접한 칸에 지뢰(1)가 있다면 false를 반환
                    if (board[row + i][col + j] == 1) {
                        return false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // 배열 인덱스가 범위를 벗어나는 경우는 무시하고 계속 진행
                    continue;
                }
            }
        }
        
        return true;  // 모든 인접한 칸이 안전하다면 true를 반환
    }

}