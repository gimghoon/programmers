import java.util.ArrayList;
import java.util.List;
class Solution {
   public int[] solution(int[] arr) {
         
        List <Integer> stkList=new ArrayList<>();
        
        int i=0;
        while(i<arr.length) {
        	if (stkList.size()==0) {
        		stkList.add(arr[i]);
        		i++;
        	}else if (stkList.get(stkList.size()-1)<arr[i]) {
        		stkList.add(arr[i]);
        		i++;
        	}else {
        		stkList.remove(stkList.size()-1);
        	}
        }
        int[] stk = stkList.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}