
function solution(n) {
  let x = n;
  const arr = [];
  while (x > 0) arr.push(x--);
  console.log(arr);

  return arr.filter((x) => n % x === 1).sort((a, b) => a - b)[0];
}