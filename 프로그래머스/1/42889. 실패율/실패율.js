function solution(N, stages) {
  let arr = [];
  for (let i = 0; i < N; i++) {
    arr.push([0, 0]);
  }

  for (let j = 0; j < stages.length; j++) {
    if (stages[j] === N + 1) {
      for (let k = 0; k < stages[j] - 1; k++) {
        arr[k][1]++;
      }
    } else {
      for (let k = 0; k < stages[j]; k++) {
        if (k === stages[j] - 1) {
          arr[k][0]++;
        }
        arr[k][1]++;
      }
    }
  }
  arr = arr
    .map((e, i) => {
      e[0] = e[0] / e[1];
      e[1] = i + 1;
      return e;
    })
    .reverse()
    .sort((a, b) => a[0] - b[0])
    .map((e) => e[1])
    .reverse();
  

  return arr;
}