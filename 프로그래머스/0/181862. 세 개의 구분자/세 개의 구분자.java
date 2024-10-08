class Solution {
	public static  String[] solution(String myStr) {
		myStr= myStr .replace("b","a").replace("c","a");
		
		
		
		String []arr=myStr.split("a");
		
		
		int count=0;
		for (String str : arr) {
			if(str.equals("")) {
				count++;
			}
			
		}
		if(count==arr.length) {
			return new String[] {"EMPTY"};
		}
		String[] answer =new String [arr.length-count];
		int k=0;
		for (String str : arr) {
			if(str.equals("")) {
				continue;
			}else {
				answer[k]=str;
				k++;
			}
		}

		
        
        
       
        return answer;
    }
}