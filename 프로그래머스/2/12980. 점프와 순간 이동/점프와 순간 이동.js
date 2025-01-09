function solution(n) {
  let count = 0;
  let num = n;
  while (num !== 0) {
    count += num % 2;
    num = Math.floor(num / 2);
  }
  return count;
}