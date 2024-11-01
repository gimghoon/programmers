function solution(s, n) {
  const num = 26;
  let answer = "";
  answer = s
    .split("")
    .map((el) => {
      if (el === " ") return el;
      if (+el.charCodeAt(0) < 96) {
       return          el.charCodeAt(0) + n > 90
            ? String.fromCharCode(+el.charCodeAt(0) + n - num)
            : String.fromCharCode(+el.charCodeAt(0) + n);
      } else {
       return           el.charCodeAt(0) + n > 122
            ? String.fromCharCode(+el.charCodeAt(0) + n - num)
            : String.fromCharCode(+el.charCodeAt(0) + n);
      }
    })
    .join("");

  return answer;
}