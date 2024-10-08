import java.util.Arrays;
class Solution {
  public static int[] solution(int[] arr) {
        
       
        
       int count=0;

    	String binaryString= Integer.toBinaryString(arr.length);
    	String num2="1";
    	StringBuilder sb= new StringBuilder(num2);
    	
    		
		
    	for (int i = 0; i < binaryString.length(); i++) {
    		
    		sb.append("0");
    		
    	}
    	String num=sb.toString();
    	System.out.println(num);
    	count=Integer.parseInt(num,2)-arr.length;
    	System.out.println(count);
    	if(count==arr.length) {
    		return arr;
    	}
    	int[] answer = new int[arr.length+count] ;
    	
    	for (int i = 0; i < arr.length; i++) {
			answer[i]=arr[i];
		}
    	for (int i = arr.length; i < answer.length; i++) {
			answer[i]=0;
		}
    	return answer;
    	
    }
}