function solution(s) {
  s = [...s]
    .sort()
    .reverse()

    .join("");

  return s;
}