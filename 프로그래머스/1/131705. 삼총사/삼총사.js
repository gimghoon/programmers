function solution(number) {
  let answer = 0;
  const arr1 = [...number];
  const arr2 = [...number];
  const arr3 = [...number];
  for (let i = 0; i < arr1.length; i++) {
    for (let j = 0; j < arr2.length && j !== i; j++) {
      for (let k = 0; k < arr3.length && k !== j; k++) {
        answer += arr1[i] + arr2[j] + arr3[k] == 0 ? 1 : 0;
      }
    }
  }
  return answer;
}