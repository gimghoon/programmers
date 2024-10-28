function solution(n) {
  return Number((n + "")
    .split("")
    .sort((a, b) => a - b)
    .reverse()
    .join(""));
}