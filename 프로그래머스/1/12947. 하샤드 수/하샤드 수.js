function solution(x) {
  return x % (x + "").split("").reduce((a, b) => Number(a) + Number(b)) === 0;
}
