import java.util.Arrays;
import java.util.HashMap;class Solution {
   public String solution(String letter) {
	 HashMap<String, String> h1 = new HashMap<String, String>( );
	StringBuilder sb= new StringBuilder();
	String [] morse= new String [] {
            ".- a", "-... b", "-.-. c", "-.. d", ". e", "..-. f",
            "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
            "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
            "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
            "-.-- y", "--.. z"
        };
	for (int i = 0; i < morse.length; i++) {
		String [] arr= morse[i].split(" ");
		h1.put(arr[0],arr[1]);
		
	}
	String [] answer= letter.split(" ");
	for(String i: answer) {
		sb.append(h1.get(i));
	}
	
    return sb.toString();
}
}