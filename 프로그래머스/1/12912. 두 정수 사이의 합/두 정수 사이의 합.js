function solution(a, b) {   
    let answer=0;
  if (a === b) return a;
  let min = Math.min(a, b);
  let max = Math.max(a, b);
  for (let i = min ; i < max+1; i++) {
    answer += i;
  }
  return answer;
}