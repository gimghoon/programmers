function solution(answers) {
  function calculate1(answerM, i) {
    let answer1 = [1, 2, 3, 4, 5];
    return answer1[i % 5] === answerM ? 1 : 0;
  }
  function calculate2(answerM, i) {
    let answer2 = [2, 1, 2, 3, 2, 4, 2, 5];
    return answer2[i % 8] === answerM ? 1 : 0;
  }
  function calculate3(answerM, i) {
    let answer3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    return answer3[i % 10] === answerM ? 1 : 0;
  }
  let answer = [];

  answer[0] = answers.reduce((a, c, i) => a + calculate1(c, i), 0);
  answer[1] = answers.reduce((a, c, i) => a + calculate2(c, i), 0);
  answer[2] = answers.reduce((a, c, i) => a + calculate3(c, i), 0);
  const max = Math.max(...answer);
  const indices = [];
  const element = max;
  let idx = answer.indexOf(element);
  while (idx !== -1) {
    indices.push(idx + 1);
    idx = answer.indexOf(element, idx + 1);
  }
  return indices;
}