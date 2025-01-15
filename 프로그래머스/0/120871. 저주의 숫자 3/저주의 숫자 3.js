function solution(n) {
  const answer = [];
  let curr = 1;

  while (answer.length < n) {
    if (curr % 3 === 0 || curr.toString().indexOf("3") >= 0) {
      curr++;
      continue;
    }
    answer.push(curr);
    curr++;
  }

  return answer[n - 1];
}