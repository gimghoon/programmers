function solution(n, a, b) {
  let aIndex = a - 1;
  let bIndex = b - 1;
  let count = 0;

  while (aIndex !== bIndex) {
    aIndex = Math.floor(aIndex / 2);
    bIndex = Math.floor(bIndex / 2);
    count++;
  }

  return count;
}