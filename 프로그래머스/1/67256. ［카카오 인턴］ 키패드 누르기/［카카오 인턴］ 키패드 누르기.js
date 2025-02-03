function solution(numbers, hand) {
  numbers = numbers.map((num) => (num === 0 ? 11 : num));

  const leftRight = {
    1: "L",
    4: "L",
    7: "L",
    3: "R",
    6: "R",
    9: "R",
  };
  let answer = [...numbers];
  let left = 10;
  let right = 12;
  for (let i = 0; i < numbers.length; i++) {
    let currnum = numbers[i];
    if (leftRight[currnum]) {
      answer[i] = leftRight[currnum];
      if (leftRight[currnum] === "L") left = currnum;
      else right = currnum;
      continue;
    }

    let leftDIstance =
      Math.abs(Math.floor((left - 1) / 3) - Math.floor((currnum - 1) / 3)) +
      Math.abs(((left - 1) % 3) - ((currnum - 1) % 3));
    let rightDistance =
      Math.abs(Math.floor((right - 1) / 3) - Math.floor((currnum - 1) / 3)) +
      Math.abs(((right - 1) % 3) - ((currnum - 1) % 3));

    if (leftDIstance > rightDistance) {
      answer[i] = "R";
      right = currnum;
    } else if (leftDIstance < rightDistance) {
      answer[i] = "L";
      left = currnum;
    } else {
      if (hand === "right") {
        answer[i] = "R";
        right = currnum;
      }
      if (hand === "left") {
        answer[i] = "L";
        left = currnum;
      }
    }
  }

  return answer.join("");
}