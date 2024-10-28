function solution(x, n) {
  var answer = [];
  const i = x;
  while (n > 0) {
    answer.push(x);
    x += i;
    n--;
  }
  return answer;
}