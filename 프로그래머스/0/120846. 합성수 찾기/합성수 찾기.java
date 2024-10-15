class Solution {
    public int solution(int n) {
        int answer = n-1;
        
        int i=2;
        while(i<=n){
            int count=0;
            int k=2;
            while(k<i){
                count+= i%k==0?1:0;
                k++;
            }
            if(count==0){
                answer--;
            }
            i++;
        }
        return answer;
    }
}