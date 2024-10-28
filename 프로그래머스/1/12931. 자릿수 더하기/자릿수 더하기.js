function solution(n) {
  const narr = String(n).split("");
  console.log(narr);
  const result = narr.map((el) => Number(el)).reduce((a, b) => a + b);
  return result;
}