class Solution {
	public int solution(int n, String control) {
		for (int i = 0; i < control.length(); i++) {
			char msg=control.charAt(i);
			switch(msg) {
			case 'w': n+=1 	;
		     break;
			case's':n-=1;
		break;
			case'd':n+=10;
			break;
			case'a':
                    n-=10;
			break;
			}
			
		}
        int answer = n;
        return answer;
    }
}