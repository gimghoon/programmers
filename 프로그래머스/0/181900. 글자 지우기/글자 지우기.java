class Solution {
    public static String solution(String my_string, int[] indices) {
		
		
    System.out.println(my_string);
        StringBuilder sb= new StringBuilder(my_string);
       for (int i = 0; i < indices.length; i++) {
			sb.replace(indices[i],indices[i]+1," ");
			System.out.println(sb);
		}
      
       return  sb.toString().replace(" ", "");
		
    }
}