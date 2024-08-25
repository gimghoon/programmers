import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    	public static int[] solution(int l, int r) {
		ArrayList<String> list_l_to_r = new ArrayList<>();
		ArrayList<String> String_listanswer = new ArrayList<>();

		for (int i = l; i < r + 1; i++) {
			list_l_to_r.add(i+"");
		}

		for (String test_num : list_l_to_r) {
			if (test_num.length() ==
				test_num.chars().filter(ch -> ch == '0').count()
				+ test_num.chars().filter(ch -> ch == '5').count()) {
				String_listanswer.add(test_num);
			}
		}
		List<Integer> integer_answerList = String_listanswer.stream().map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());

		if (integer_answerList.size() == 0)
		{
			return new int[] {-1};
		}
		int[] answer_array = new int[integer_answerList.size()];
		for (int i = 0; i < integer_answerList.size(); i++) {
			answer_array[i] = integer_answerList.get(i).intValue();
		}

		return answer_array;
	}
}