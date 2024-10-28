function solution(arr) {
  const answer = arr.reduce((acc, el) => acc + el) / arr.length;
  return answer;
}
