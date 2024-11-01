function solution(d, budget) {
  let answer = 0;
  d.sort((a, b) => a - b);
  d.reduce((acc, curr) => {
    if (acc >= curr) {
      answer += 1;
      return acc - curr;
    }
  }, budget);
  return answer;
}