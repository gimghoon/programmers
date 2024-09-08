class Solution {
   public static int solution(int a, int b) {
        if((a+b)%2==0){
            if(a%2==0){
                return Math.abs(a-b);
                
            }else{
                return (int) (Math.pow(a,2)+Math.pow(b,2));
            }
        }else{
            return 2*(a+b);
        }
       
    }
}