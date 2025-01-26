function solution(arr1, arr2) {
  const rows = arr1.length;
  const cols = arr2[0].length;
  const common = arr1[0].length;
  const answer = Array.from({ length: rows }, () => Array(cols).fill(0));

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      for (let k = 0; k < common; k++) {
        answer[i][j] += arr1[i][k] * arr2[k][j];
      }
    }
  }

  return answer;
}
