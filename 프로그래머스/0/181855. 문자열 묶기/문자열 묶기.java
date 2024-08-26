class Solution {
     public int solution(String[] strArr) {// 문자열 배열 strArr이 주어집니다.
        int answer = 0;
        // strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
        // strArr[0].length => 개수
        // pseudo code -> 의사코드
        
        // 각 길이마다의 개수가 담길 배열 선언
        // 최대 길이가 30이기 때문에, 배열의 길이도 30으로 선언
        int[] arrCount = new int[30];
        for(int i=0; i < strArr.length; i++){
            // strArr의 요소를 임시로 담을 변수 선언
            String temp = strArr[i]; // ["a","bc","d","efg","hi"]
            
            // 증가시킬 원소의 길이를 담을 변수 선언
            int targetIndex = temp.length()-1; // -1을 하는 이유는 배열은 0번째부터 시작이기 때문이다.
            // 길이 요소의 개수를 세는 배열의 해당 요소의 값을 1 증가시키는 것으로 카운팅한다.
            arrCount[targetIndex] += 1;
        }
        // 가장 개수가 많은 그룹의 크기
        for(int e : arrCount){
            // answer에는 최초 0이 담겨 있고
            // arrCount에는 주어졌던 길이들의 개수가 담겨 있다.
            answer = e > answer ? e : answer; // 그 중 가장 큰 개숫값을 answer에 담는 코드
        }
        // 를 return 하는 solution 함수를 완성해 주세요.
        return answer;
    }

}