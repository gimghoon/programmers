function solution(lines) {
  let answer = 0;
  const two = (x, y) => {
    const length = Math.min(x[1], y[1]) - Math.max(x[0], y[0]);
    answer += length < 0 ? 0 : length;
  };
  two(lines[0], lines[1]);
  two(lines[2], lines[1]);
  two(lines[0], lines[2]);
  const three =
    Math.min(lines[0][1], lines[1][1], lines[2][1]) -
    Math.max(lines[0][0], lines[1][0], lines[2][0]);

  return three > 0 ? answer - three*2: answer;
}