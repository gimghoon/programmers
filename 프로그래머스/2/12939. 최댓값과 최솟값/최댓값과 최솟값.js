function solution(s) {
  const a = s.split(" ").sort((a, b) => a - b);

  return `${a[0]} ${a[a.length - 1]}`;
}
