function solution(s) {
  let answer = true;
  const result = s
    .split("")

    .reduce((a, c) => {
      if (a + (c === "(" ? 1 : -1) === -1) answer = false;

      return a + (c === "(" ? 1 : -1);
    },0);

  if (!answer) return false;
  answer = !result ? true : false;

  return answer;
}