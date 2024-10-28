function solution(arr, divisor) {
  const a = arr.filter((el) => el % divisor == 0).sort((a, b) => a - b);
  return a.length ? a : [-1];
}