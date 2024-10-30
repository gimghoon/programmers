function solution(arr) {
  let answer = [];
 
  answer = arr.filter((_, index, arr) => arr[index] !== arr[index + 1]);

  return answer;
}