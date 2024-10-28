function solution(absolutes, signs) {
  
  return absolutes.map((e, i) => (signs[i] ? +e : -e)).reduce((a, b) => a + b);
}