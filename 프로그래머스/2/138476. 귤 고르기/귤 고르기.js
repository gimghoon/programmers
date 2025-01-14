function solution(k, tangerine) {
  var answer = 0;
  tangerine.sort((a, b) => b - a);
  console.log(tangerine);
  let tangerineCount = [];
  let prev = null;
  let prevCount = 0;
  for (let i = 0; i < tangerine.length; i++) {
    if (i === 0 && !tangerine.length === 1) {
      prevCount = 1;
      prev = tangerine[i];
      continue;
    }
    if (prev === tangerine[i]) {
      prevCount += 1;
    } else {
      tangerineCount.push(prevCount);

      prevCount = 1;
    }
    prev = tangerine[i];
  }
  tangerineCount.push(prevCount);

  console.log(tangerineCount);

  //   tangerine.forEach((element) => {
  //     console.log(element, prev, prevCount);
  //     if (prev === element) {
  //       prevCount += 1;
  //     } else {
  //       tangerineCount.push(prevCount);

  //       prevCount = 0;
  //     }
  //     prev = element;
  //   });
  console.log(tangerineCount);
  tangerineCount = tangerineCount.sort((a, b) => b - a);
  console.log(tangerineCount);
  tangerineCount.reduce((a, c, i) => {
    if (a >= k) answer = i;
    else {
      return a + c;
    }
  });
  return answer;
}