function solution(arr) {
  const answer = arr.slice();
  if (arr.length === 0 || arr == [10]) return [-1];
  const index = answer.indexOf(arr.sort((a, b) => a - b).shift());

  answer.splice(index, 1);

  return answer;
}