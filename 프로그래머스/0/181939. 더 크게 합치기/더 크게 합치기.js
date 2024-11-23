function solution(a, b) {
  var answer =
    "" + a + b > "" + b + a ? Number("" + a + b) : Number("" + b + a);
  return answer;
}