function solution(n, m) {
  let nall = [];
  let mall = [];
  for (let i = 1; i <= n; i++) {
    nall.push(i);
  }
  for (let i = 1; i <= m; i++) {
    mall.push(i);
  }
  let Max = [];
  Max = nall
    .filter((el) => n % el == 0)
    .concat(mall.filter((el) => m % el == 0))
    .sort((a, b) => a - b)
     .filter((_, index, arr) => arr[index] === arr[index + 1]);
  const Maxvalue = Max.at(-1);
  const Minvalue = (n * m) / Maxvalue;
  return [Maxvalue, Minvalue];
}