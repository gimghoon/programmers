function solution(dartResult) {
  const calculateScore = (score, type) => {
    switch (type) {
      case "S":
        return Math.pow(score, 1);
      case "D":
        return Math.pow(score, 2);
      case "T":
        return Math.pow(score, 3);
      default:
        return 0;
    }
  };

  const pattern = /(\d+)([DST])([*#]?)\s?/g;
  const scores = [];
  let match;

  while ((match = pattern.exec(dartResult)) !== null) {
    const number = parseInt(match[1]);
    const type = match[2];
    const modifier = match[3];

    let score = calculateScore(number, type);

    if (modifier === "*") {
      score *= 2;
      if (scores.length > 0) {
        scores[scores.length - 1] *= 2;
      }
    } else if (modifier === "#") {
      score *= -1;
    }

    scores.push(score);
  }

  return scores.reduce((a, c) => a + c, 0);
}