function solution(number, limit, power) {
  function findnum(number) {
    let result = [];
    let index = 1;
    while (index <= Math.sqrt(number)) {
      if (number % index === 0) {
        result.push(index);
        if (number / index !== index) result.push(number / index);
      }
      index++;
    }
    return result.length;
  }
  var answer = 0;
  for (let i = 1; i <= number; i++) {
    answer += findnum(i) > limit ? power : findnum(i);
  }

  return answer;
}