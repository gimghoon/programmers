import java.util.ArrayList;
class Solution {
  public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 7, 2, 5, 4, 6, 1},new boolean [] {false, true, true, true, true, false, false}));
		
	}
	public static int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> particapant=new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
        	
			if(attendance[i]) {
				particapant.add(rank[i]);			}
		}
			
		particapant.sort(null);
        
        int answer=0;
        int firstrank=particapant.get(0);
        int seconRank=particapant.get(1);
        int thirdRank=particapant.get(2);
        for (int i = 0; i < rank.length; i++) {
			answer+=rank[i]==firstrank?i*10000:rank[i]==seconRank?i*100:rank[i]==thirdRank?i:0;
		}
        return answer;
    }
}
