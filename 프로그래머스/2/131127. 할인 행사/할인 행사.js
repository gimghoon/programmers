
function solution(want, number, discount) {
  let forClient = number.reduce((a, c) => a + c);
  function compareWant(arr) {
    let count = 0;
    for (let k = 0; k < want.length; k++) {
      count += arr.filter((e) => e == want[k]).length === number[k] ? 1 : 0;
    }
    return count === number.length ? 1 : 0;
  }
  var answer = 0;
  for (let i = 0; i <= discount.length - number.length; i++) {
    const compareArr = discount.slice(i, i + forClient );
    answer += compareWant(compareArr);
  }
  return answer;
}