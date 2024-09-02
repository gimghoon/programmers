import java.util.Arrays;
class Solution {
 public static int[] solution(int[] arr) {

		int count=0;
        for(int e:arr) {
        	if (e==2) {
        		count++;
        	}
        }
        if(count==0) {
        	return new int[] {-1};
        }else if (count==1) {
        	return new int[] {2};
        } 
        int [] countTwoIdx=new int [count];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
        	
			if (arr[i]==2) {
				countTwoIdx[k]=i;
				k++;
			}
		}
        int length= countTwoIdx[countTwoIdx.length-1]-countTwoIdx[0]+1;
        int []answer= new int[length];
        System.arraycopy(arr, countTwoIdx[0], answer, 0, length);
        
		/*
		 * int k=0; int[] idx= new int [count]; for (int i = 0; i < arr.length; i++) {
		 * if(arr[i]==2 ) { idx[k]=i;
		 * 
		 * if(k==idx.length) { break;
		 * 
		 * }
		 * 
		 * k++; } } int[] answer = new int[idx[idx.length-1]-idx[0]+1];
		 * System.arraycopy(arr, idx[0], answer,0 , idx[idx.length-1]-idx[0]+1); int []
		 * ifno2=new int[] {-1}; return count==0?ifno2:answer;
		 */
        return answer;
    }}