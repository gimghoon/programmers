function solution(numbers) {
  let length = numbers.length;

  return numbers.reduce((a, c) => a + c) / length;
}
