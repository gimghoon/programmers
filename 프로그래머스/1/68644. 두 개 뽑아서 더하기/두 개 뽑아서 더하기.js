function solution(numbers) {
  let answer = [];
  for (let i = 0; i < numbers.length; i++) {
    for (let j = 0; j < numbers.length; j++) {
      if (i === j) continue;
      answer.push(numbers[i] + numbers[j]);
    }
  }
  console.log(answer);
   answer.sort((a, b) => a - b);
  const set = new Set(answer);

 return [...set];
}

