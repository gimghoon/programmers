
function solution(food) {
  var answer = "";
  let front = "";

  food.forEach((element, index) => {
       front += index > 0 ? (index + "").repeat(Math.floor(element / 2)) : "";
  });
  answer = front + "0" + front.split("").reverse().join("");

  return answer;
}
