function solution(k, m, score) {
  score = score.sort((a, b) => a - b).reverse();

  let answer = 0;
  answer = score
    .filter((_, i) => i % m === m - 1)
    .reduce((a, c) => a + c * m, 0);
  return answer === 0 ? 0 : answer;
}