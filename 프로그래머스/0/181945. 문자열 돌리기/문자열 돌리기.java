import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i=0;
        while(i<a.length()) {
        	System.out.println(a.charAt(i));
        	i++;
        }
    }
}