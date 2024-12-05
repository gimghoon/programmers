function solution(emergency) {
  let obj = {};
  let emergency2 = emergency.slice();

  emergency2
    .sort((a, b) => a - b)
    .reverse()
    .map((e, i) => {
      obj[e] = i + 1;
    });
 

  return emergency.map((e) => obj[e]);
}