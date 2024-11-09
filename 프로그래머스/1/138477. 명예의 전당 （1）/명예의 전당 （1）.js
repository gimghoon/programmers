function solution(k, score) {
  let answer = [];
  let arr = [];
  score.map((e, i) => {
    arr.push(e);
    if (i + 1 <= k) {
      answer.push(arr.sort((a, b) => a - b)[0]);
    } else {
      answer.push(arr.sort((a, b) => b - a)[k - 1]);
    }
  });
  return answer;
}

