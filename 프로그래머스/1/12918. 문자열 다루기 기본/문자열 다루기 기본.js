function solution(s) {
  if (!(s.length === 4 || s.length === 6)) return false;
  for (let i = 0; i < s.length; i++) {
    if (!(0 <= +s.charAt(i) && +s.charAt(i) <= 9)) return false;
  }
  return true;
}