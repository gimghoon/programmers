function solution(survey, choices) {
  const category = {
    R: 0,
    T: 0,
    C: 0,
    F: 0,
    J: 0,
    M: 0,
    A: 0,
    N: 0,
  };
  for (let i = 0; i < choices.length; i++) {
    if (choices[i] < 4) {
      category[survey[i].slice(0, 1)] += 4 - choices[i];
    } else if (choices[i] > 4) {
      category[survey[i].slice(1, 2)] += choices[i] - 4;
    }


  }
  function checkPersonality(category) {
    let answer = "";
    answer += category.R < category.T ? "T" : "R";
    answer += category.C < category.F ? "F" : "C";
    answer += category.J < category.M ? "M" : "J";
    answer += category.A < category.N ? "N" : "A";
    return answer;
  }
  return checkPersonality(category);
}