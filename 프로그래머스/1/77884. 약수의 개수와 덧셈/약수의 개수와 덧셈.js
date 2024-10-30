function solution(left, right) {
  var answer = 0;
  for (let i = left; i < right + 1; i++) {
    answer += countyak(i) % 2 == 0 ? i : -i;
  }
  return answer;
}
function countyak(number) {
  const numarr = [];
  const num = number;
  while (number > 0) {
    numarr.push(number--);
  }
  return numarr.filter((number) => num % number == 0).length;
}