function solution(n, control) {
  var answer = 0;
  answer = control
    .split("")
    .map((e) => {
      switch (e) {
        case "w":
          return 1;
        case "s":
          return -1;
        case "d":
          return 10;
        case "a":
          return -10;
      }
    })
    .reduce((a, c) => a + c,n);
  return answer;
}