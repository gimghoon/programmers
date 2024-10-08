class Solution {
    
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int [] answer = new int[intStrs.length];
		int m=0;
		int answerlength=0;
		for (int i = 0; i < intStrs.length; i++) {
			answer[i]=Integer.parseInt(intStrs[i].substring(s,s+l));
			answerlength+=answer[i]>k?1:0;
		}
		System.out.println(answer);
		
		
		int [] arranswer= new int[answerlength];
		for (int i = 0; i < answer.length; i++) {
			
			if(answer[i]>k) {
				
				arranswer[m]=answer[i];
				m++;
			}
		}
		return arranswer;
	}
}