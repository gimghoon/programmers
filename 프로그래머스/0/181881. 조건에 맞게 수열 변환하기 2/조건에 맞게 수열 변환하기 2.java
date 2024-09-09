class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] numArr = new int[arr.length];
        
        while (true) {
            Boolean flag = true;
            
            for (int i = 0; i < arr.length; i++) {
                numArr[i] = arr[i];
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    numArr[i] = arr[i];
                    arr[i] = arr[i] * 2 + 1;
                }
                
                if (arr[i] != numArr[i]) {
                    flag = false;
                }
            }
            if (flag) break;
            answer++;
        }
        
        return answer;
    }
}