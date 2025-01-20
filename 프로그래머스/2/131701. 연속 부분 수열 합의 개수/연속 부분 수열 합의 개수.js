function solution(elements) {
  const twoEl = elements.concat(elements);
  var answer = [];
  for (let i = 1; i <= elements.length; i++) {
    for (let k = 0; k < elements.length; k++) {
      let piece = twoEl.slice(k, k + i ).reduce((a, c) => a + c);
      answer.push(piece);
    }
  }
  const set = new Set(answer);
  return [...set].length;
}
