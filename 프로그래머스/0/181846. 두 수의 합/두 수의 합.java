class Solution {
  public static String solution(String a, String b) {
		int length= (int) Math.max(a.length(), b.length());
		int [] arr1= new int[length];
		int [] arr2= new int[length];
		
		int [] arr_answer= new int[length+1];
		for (int i = 0; i <a.length(); i++) {
			arr1[a.length()-i-1]=a.charAt(i)-'0';
		}
		for (int i = 0; i <b.length(); i++) {
			arr2[b.length()-i-1]=b.charAt(i)-'0';
			
		}
		
		
		for (int i = 0; i < length; i++) {
			
			arr_answer[i]+=arr1[i]+arr2[i];
			if(arr_answer[i]>9) {
				
				arr_answer[i]-=10;
				arr_answer[i+1]+=1;
			}
		}
		StringBuilder answer= new StringBuilder ();
		for (int i = 0; i < arr_answer.length; i++) {
			answer.append(arr_answer[arr_answer.length-i-1]);
		}
      if(answer.charAt(0)-'0'==0) {
			answer.deleteCharAt(0);
		}
		
		
		
        return answer.toString();
    }
}