import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		/*
		 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
		 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해
		 * 보세요.
		 */
		Scanner sc= new Scanner(System.in);
		String  str=sc.next();
		for (int i = 0; i < str.length(); i++) {
			int temp= str.charAt(i)>96? str.charAt(i)-32:str.charAt(i)+32;
			System.out.print((char)temp);
		}
	}

}
