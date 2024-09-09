
import java.util.Arrays;
class Solution {
   public static String[] solution(String[] picture, int k) {
    int[] size=new int[picture.length];
    for (int i = 0; i < size.length; i++) {
		size[i]=picture[i].length();
	}
    	
    	
        String []answer=new String [picture.length*k];
    for (int i = 0; i < picture.length; i++) {
    	
		String []pictureElement=new String[picture[i].length()];
		for (int j = 0; j < pictureElement.length; j++) {
			pictureElement[j]=picture[i].charAt(j)+"";
			
		}
		picture[i]="";
		for (int j = 0; j < pictureElement.length; j++) {
			
			picture[i]=picture[i]+pictureElement[j].repeat(k);
		}
	
	for (int j = 0; j < k; j++) {
		answer[i*k+j]=picture[i];
	}
		System.out.println(Arrays.toString(picture));
		System.out.println(i);
	}
   
   
    return answer;
}
}