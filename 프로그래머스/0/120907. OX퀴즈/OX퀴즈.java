class Solution {
     public static String[] solution(String[] quiz) {
	        String[] answer = new String [quiz.length];
	        for (int i = 0; i < quiz.length; i++) {
				String [] splitquiz= quiz[i].split(" ");
				if (splitquiz[1].equals("+")&& Integer.parseInt(splitquiz[0])+Integer.parseInt(splitquiz[2])==Integer.parseInt(splitquiz[4])) {
					answer[i]="O";
				}else if(splitquiz[1].equals("-")&& Integer.parseInt(splitquiz[0])-Integer.parseInt(splitquiz[2])==Integer.parseInt(splitquiz[4])) {
					answer[i]="O";
				}else {
					answer[i]="X";
				}
			}
	        return answer;
	    }
}