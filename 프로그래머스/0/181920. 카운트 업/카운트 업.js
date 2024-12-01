function solution(start_num, end_num) {
  var answer = [];
  for (let i = start_num; i <= end_num; i++) {
    answer.unshift(i);
  }
  return answer.sort((a,b)=>a-b);
}
