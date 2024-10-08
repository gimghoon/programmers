class Solution {
   public static int solution(int[] num_list) {
        
		int answer = 0;
		String even="";
		String odd="";
		
        for (int i = 0; i < num_list.length; i++) {
        	if(num_list[i]%2==0) {
        		even+=num_list[i];
        		
        	}else {
        		odd+=num_list[i];
        	}
        	
		}
        System.out.println(even);
        System.out.println(odd);
		return Integer.parseInt(odd)+Integer.parseInt(even);
    }
}