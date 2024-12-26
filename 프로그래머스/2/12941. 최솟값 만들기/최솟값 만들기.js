function solution(A, B) {
  var answer = 0;
  const a = A.sort((a, b) => a - b);
  const b = B.sort((a, b) => a - b).reverse();
  // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
  answer = a.reduce((a, c, i) => a + c * b[i], 0);

  return answer;
}