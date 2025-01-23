function solution(n, left, right) {
  const answer = [];
  for (let i = left; i <= right; i++) {
    let numberShare = Math.floor(i / n);
    let numberLeft = i % n;
    if (numberLeft <= numberShare) {
      answer.push(numberShare + 1);
    } else {
      answer.push(Math.max(numberShare, numberLeft) + 1);
    }
  }
  return answer;
}