function solution(a, d, included) {
  answer = included
    .map((e, i) => (e? a + i * d : 0))

    .reduce((a, c) => a + c);

  return answer;
}
