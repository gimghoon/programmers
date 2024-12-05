function solution(a, b) {
  let getGCD = (num1, num2) => {
    let gcd = 1;

    for (let i = 2; i <= Math.min(num1, num2); i++) {
      if (num1 % i === 0 && num2 % i === 0) {
        gcd = i;
      }
    }

    return gcd;
  };
  function soinso(n) {
    let result = [];
    let divisor = 2;

    while (n >= 2) {
      if (n % divisor === 0) {
        result.push(divisor);
        n = n / divisor;
      } else divisor++;
    }

    return [...new Set(result)];
  }
  let answer = 0;
  answer = soinso(b/ getGCD(a, b));
  return answer.slice().filter((e) => e === 2 || e === 5).length ===
    answer.length
    ? 1
    : 2;
}