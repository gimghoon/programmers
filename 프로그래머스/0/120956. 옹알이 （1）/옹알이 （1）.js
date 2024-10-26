function solution(babbling) {
  const babblingpossible = ["aya", "ye", "woo", "ma"];

  var answer = 0;
  babbling.forEach((element) => {
    let count = 0;
    babblingpossible.forEach((elementp) => {
      count += element.indexOf(elementp) !== -1 ? elementp.length : 0;
    });

    answer += element.length === count ? 1 : 0;
   
  });

  return answer;
}