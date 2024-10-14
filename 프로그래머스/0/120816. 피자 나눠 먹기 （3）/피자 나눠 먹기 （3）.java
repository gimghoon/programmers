class Solution {
    public int solution(int slice, int n) {
        int numberpizza=0;
        while(true){
            if(slice*numberpizza>=n){
                break;
            }
            numberpizza++;
        }
        return numberpizza;
    }
}