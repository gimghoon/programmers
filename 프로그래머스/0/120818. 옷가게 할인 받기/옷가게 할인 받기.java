class Solution {
   public static int solution(int price) {
        int answer = 0;
        
        return (int) (price>=500000?Math.floor(price*0.8):price>=300000?Math.floor(price*0.9):price>=100000?Math.floor(price*0.95):price);
        }
}