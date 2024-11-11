
function solution(cards1, cards2, goal) {
  const length = cards1.length + cards2.length;
  console.log(length);
  const one = cards1
    .map((e) => {
      return goal.findIndex((i) => i === e);
    })
    .map((m) => {
      if (m === -1) return length + 1;
      return m;
    });
  const two = cards2
    .map((e) => {
      return goal.findIndex((i) => i === e);
    })
    .map((m) => {
      if (m === -1) return length + 1;
      return m;
    });
  console.log(one);
  console.log(two);
  let answer = "";
  answer =
    JSON.stringify(one) === JSON.stringify(one.slice().sort((a, b) => a - b)) &&
    JSON.stringify(two) === JSON.stringify(two.slice().sort((a, b) => a - b))
      ? "Yes"
      : "No";
  return answer;
}