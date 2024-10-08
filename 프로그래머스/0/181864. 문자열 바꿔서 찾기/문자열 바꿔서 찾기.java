class Solution {
    public static int solution(String myString, String pat) {
        
        String str= myString.replaceAll("A", "b").replaceAll("B", "A").replaceAll("b", "B");
        
        
        
        return str.contains(pat)?1:0;
    }
}