class Solution {
   public int solution(String[] strArr) {
		int answer=0;
		int []arrCount= new int [30];
		for (int i = 0; i < strArr.length; i++) {
			int temp=strArr[i].length();
			arrCount[temp-1]++;
		
		}
		for (int e:arrCount) {
			answer= e>answer? e:answer;
		}
		
        return answer;
    }
}