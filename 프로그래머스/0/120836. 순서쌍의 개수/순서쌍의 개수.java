class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(i<=n){
            answer+=n%i==0?1:0;
            i++;
        }
        
        return answer;
    }
}