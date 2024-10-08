class Solution {
  public static String solution(String myString) {
        String answer="";
        StringBuilder sb= new StringBuilder(myString.toLowerCase());
        
        for (int i = 0; i < sb.length(); i++) {
         if (sb.charAt(i)=='a')
         {	sb.setCharAt(i, 'A');
        	 }	
         }
        	 
        
        return sb.toString();

}
}