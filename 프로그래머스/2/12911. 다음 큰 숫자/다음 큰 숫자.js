function solution(n) {
  let answer = n + 1;
  function countOne(n) {

    let strn = n.toString(2);

    return strn
      .split("")
      .filter((e) => e == 1)
      .join("").length;
  }

  while (n >= 1) {
    if (countOne(n) === countOne(answer)) return answer;
    answer += 1;
  }
}