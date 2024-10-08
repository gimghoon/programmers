class Solution {
   	public static int[] solution(int[] num_list) {
        
        int lastNum = num_list[num_list.length-1];
        int beforeNum = num_list[num_list.length-2];
        
        int newElement=(lastNum >beforeNum)? lastNum-beforeNum:lastNum*2;
        int [] answer= new int[num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        answer[answer.length-1]= newElement;
    
        
        
        
        		
        
        

        return answer;
    }
}