function solution(s) {
  let arr = s.split("");
  var answer = true;
  answer =
    arr.filter((el) => el === "p" || el === "P").length ===
    arr.filter((el) => el === "y" || el === "Y").length
      ? true
      : false;

  return answer;
}