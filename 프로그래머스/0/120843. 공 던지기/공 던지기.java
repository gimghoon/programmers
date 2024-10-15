class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer=(2*k-1)%numbers.length!=0?(2*k-1)%numbers.length:numbers.length;
        return answer;
    }
}