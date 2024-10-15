import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, String direction) {
		  	int []arrdoublenumbers= new int [numbers.length*2];
		  	for (int i = 0; i <arrdoublenumbers.length; i++) {
				for (int j = 0; j < arrdoublenumbers.length; j++) {
					if(i%numbers.length==j) {
						arrdoublenumbers[i]=numbers[j];
					}
				}
			}
		  	int[] answer = {};
		  			  	answer= direction.equals("right")?Arrays.copyOfRange(arrdoublenumbers, numbers.length-1,numbers.length*2-1):Arrays.copyOfRange(arrdoublenumbers, 1,1+numbers.length);

	        return answer;
	    }
}