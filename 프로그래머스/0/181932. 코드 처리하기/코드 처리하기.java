class Solution {
public static String solution(String code) {
		int mode = 0;
		String ret = "";
		for (int idx = 0; idx < code.length(); idx++) {

			if (code.charAt(idx) != '1') {
				ret = (mode + idx) % 2 == 0 ? ret.concat(Character.toString(code.charAt(idx))) : ret;

			} else {
				mode = (mode >= 1) ? 0 : 1;
			}

		}

		return (ret.length()==0)?"EMPTY":ret;

		
		}

}