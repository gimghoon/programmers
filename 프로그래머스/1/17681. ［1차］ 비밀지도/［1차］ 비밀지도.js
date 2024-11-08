function solution(n, arr1, arr2) {
  function numToBinaryNumArr(num) {
    let bin = num.toString(2);
    while (bin.length < n) {
      bin = "0" + bin;
    }
    return bin.split("").map((e) => Number(e));
  }
  arr1 = arr1.map((e) => numToBinaryNumArr(e));
  arr2 = arr2.map((e) => numToBinaryNumArr(e));
  let answer = JSON.parse(JSON.stringify(arr1));
  for (let i = 0; i < arr1.length; i++) {
    for (let j = 0; j < n; j++) {
      let a1 = arr1[i][j];
      let a2 = arr2[i][j];

      if (a1 + a2 === 0) {
        answer[i][j] = " ";
      } else {
        answer[i][j] = "#";
      }
    }
    answer[i] = answer[i].join("");
  }
  return answer;
}