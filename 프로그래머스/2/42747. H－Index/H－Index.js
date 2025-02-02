function solution(citations) {
  citations.sort((a, b) => b - a);
  let hidx = 0;
  for (let i = 0; i < citations.length; i++) {
    if (citations[i] >= i + 1) {
      hidx = i + 1;
    }
  }

  return hidx;
}