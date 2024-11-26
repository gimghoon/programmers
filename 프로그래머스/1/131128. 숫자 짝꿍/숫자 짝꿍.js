function solution(X, Y) {
  let answer = [];
  const x = { 0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0 };
  const y = { 0: 0, 1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0 };

  X.split("").forEach((e) => (x[e] += 1));
  Y.split("").forEach((e) => (y[e] += 1));
  console.log(x);
  console.log(y);
  for (let i = 9; i >= 0; i--) {
    if (!Math.min(x[i], y[i])) continue;
      if (i === 0 && !answer.length) return "0";
    for (let j = 1; j <= Math.min(x[i], y[i]); j++) {
      answer.push(i);
    }
     
  }
  console.log(answer);
   return answer.length ? answer.join("") : "-1";
}
