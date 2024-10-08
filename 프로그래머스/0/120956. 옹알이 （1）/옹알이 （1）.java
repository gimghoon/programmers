class Solution {
  public static int solution(String[] babbling) {
    int answer = 0;
    
    String [] babblecase= new String [] {"aya", "ye", "woo", "ma"};
    
    for (int i = 0; i < babbling.length; i++) {
    	int count=0;
		String s=babbling[i];
		for (int j = 0; j < babblecase.length; j++) {
			count+=s.contains(babblecase[j])?babblecase[j].length():0;
		}
		answer+=s.length()==count?1:0;	}
	return answer;
}
}