
function solution(s) {
  answer =
    s.length % 2 == 1
      ? s
          .split("")
          .splice(Math.floor(s.length / 2),1)
          .join("")
      : s
          .split("")
          .splice(s.length / 2 - 1, 2)
          .join("");

  return answer;
}