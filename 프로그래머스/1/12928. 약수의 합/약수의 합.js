function solution(n) {
  const m = n;
  const arr = [];
  while (n > 0) {
    arr.push(n--);
  }
 
  let answer = 0;
  const result = arr.filter((el) => m % el == 0);

  for (const el of result) {
    answer += el;
  }

  return answer;
}