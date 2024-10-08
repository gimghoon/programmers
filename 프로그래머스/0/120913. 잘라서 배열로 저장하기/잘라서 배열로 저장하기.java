class Solution {
 public static String[] solution(String my_str, int n) {
    
    int str_num= my_str.length()/n+1;
   
    int count=0;
    
    StringBuilder sb= new StringBuilder(my_str);
    for (int i = 1; i <str_num; i++) {
		sb.insert(n*i+count,".");
		count++;
	}
    System.out.println(sb.toString());
   String answerstr=sb.toString();
   String []answer=answerstr.split("\\.");
    return answer;
}
}