function solution(n, words) {
  for (let i = 0; i < words.length; i++) {
    const currentWord = words[i];

    // Check for repeated word
    if (words.indexOf(currentWord) !== i) {
      const player = (i % n) + 1;
      const round = Math.ceil((i + 1) / n);
      return [player, round];
    }

    // Check if the current word violates the last-letter rule
    if (i > 0 && words[i - 1].slice(-1) !== currentWord[0]) {
      const player = (i % n) + 1;
      const round = Math.ceil((i + 1) / n);
      return [player, round];
    }
  }

  // If no one fails, return [0, 0]
  return [0, 0];
}