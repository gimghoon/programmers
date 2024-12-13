function solution(participant, completion) {
  participant.sort();
  completion = [...completion.sort(), 0];
  console.log(participant, completion);
  for (let i = 0; i < participant.length; i++) {
    if (participant[i] !== completion[i]) return participant[i];
  }
}

