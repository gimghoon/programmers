function solution(a, b) {
  const month = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  let answer = 0;
  for (let i = 0; i < a; i++) {
    answer += month[i];
  }
  answer += b;
  switch (answer % 7) {
    case 1:
      return "FRI";
    case 2:
      return "SAT";
    case 3:
      return "SUN";
    case 4:
      return "MON";
    case 5:
      return "TUE";
    case 6:
      return "WED";
    case 0:
      return "THU";
  }
  
}