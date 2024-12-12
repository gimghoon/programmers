function solution(lottos, win_nums) {
  let zero_length = lottos.slice().filter((e) => e === 0).length;
  lottos = lottos.filter((e) => win_nums.includes(e));
  let firstel =
    lottos.length + zero_length <= 1 ? 6 : 7 - (lottos.length + zero_length);
  let secondel = lottos.length <= 1 ? 6 : 7 - lottos.length;
  var answer = [firstel, secondel];
  return answer;
}
