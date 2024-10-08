import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> numList= new ArrayList<>();
        for(int e:arr) {
        	numList.add(e);
        }
        for (int j = 0; j < delete_list.length; j++) {
				for (int i = 0; i < numList.size(); i++) {
				if(numList.get(i)==delete_list[j]) {
					numList.remove(i);
				}
			}
		}
		Integer [] answerarr = numList.toArray(new Integer [0]);
		int [] answer=new int[answerarr.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=answerarr[i];
		}
		
        return answer;
    }
}