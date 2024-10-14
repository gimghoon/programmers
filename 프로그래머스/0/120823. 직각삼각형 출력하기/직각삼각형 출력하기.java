import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        StringBuilder sb= new StringBuilder();
	        sb.append("*");
	        int i=1;
	        while(i<=n) {
	        	System.out.println(sb.toString());
	        	sb.append("*");
	        	i++;
	        	
	        }
	        
	    }
}