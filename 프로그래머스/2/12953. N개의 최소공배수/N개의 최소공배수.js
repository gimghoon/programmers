function solution(arr) {
  var answer = 0;
  let getLCM = (num1, num2) => {
    let lcm = 1;

    while (true) {
      if (lcm % num1 == 0 && lcm % num2 == 0) {
        break;
      }
      lcm++;
    }
    return lcm;
  };
  answer = arr.reduce((a, c) => getLCM(a, c));
  return answer;
}
