class Solution {
  public static String solution(int age) {
		String answer = "";
		String agestr = age + "";

		for (int j = 0; j < agestr.length(); j++) {

			switch (agestr.charAt(j) - 48) {
			case 0:
				answer += "a";
				continue;
			case 1:
				answer += "b";
				continue;
			case 2:
				answer += "c";
				continue;
			case 3:
				answer += "d";
				continue;
			case 4:
				answer += "e";
				continue;
			case 5:
				answer += "f";
				continue;
			case 6:
				answer += "g";
				continue;
			case 7:
				answer += "h";
				continue;
			case 8:
				answer += "i";
				continue;
			case 9:
				answer += "j";
				continue;
			

			}
		}

		return answer;
	}
}