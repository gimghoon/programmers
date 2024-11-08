function solution(strings, n) {
  const answer = strings.sort((a, b) => {
    if (a.charAt(n) < b.charAt(n)) {
      return -1;
    } else if (a.charAt(n) === b.charAt(n)) {
      return a < b ? -1 : 1;
    } else {
      return 1;
    }
  });
  return answer;
}