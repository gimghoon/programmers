class Solution {
   public int solution(String[] order) {
		int americano=0;
		int latte=0;
		for(String s:order) {
			americano+=s.contains("americano")?1:0;
			americano+=s.contains("anything")?1:0;
			latte+=s.contains("latte")?1:0;
		}
        
        return 4500*americano+5000*latte;
    }
}