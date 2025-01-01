function solution(brown, yellow) {
  let col = 0;
  let a = 0;
  while (1) {
    a++;
    if (a * ((brown + 4) / 2 - a) === brown + yellow) {
      col = a;
      break;
    }
  
  }

  const answer = [Math.floor((brown + yellow) / col), col];
  return answer;
}