function solution(people, limit) {
  let answer = 0;
  people.sort((a, b) => a - b);
  let index = 0;

  for (let i = people.length - 1; i >= index; i--) {
    if (people[index] + people[i] <= limit) {
      index++;
    }
    answer++;
  }
  return answer;
}