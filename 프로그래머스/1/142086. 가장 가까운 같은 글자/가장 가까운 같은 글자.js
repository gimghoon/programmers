function solution(s) {
  const obj = {};
  s.split("").forEach((el) => {
    if (!obj[el]) obj[el] = -1;
  });
  const answer = s.split("").map((e, i) => {
    if (obj[e] === -1) {
      obj[e] = i;
      return -1;
    }
    const a = i - obj[e];
    obj[e] = i;

    return a;
  });

  return answer;
}
