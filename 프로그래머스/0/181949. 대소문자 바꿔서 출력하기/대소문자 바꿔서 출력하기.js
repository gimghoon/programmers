const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = [line];
}).on("close", function () {
  str = input[0];
  let answer = "";
  var arr = [];
  for (let index = 0; index < str.length; index++) {
    if (str.charAt(index).charCodeAt() < 96) {
      arr[index] = str.charAt(index).toLowerCase();
    } else {
      arr[index] = str.charAt(index).toUpperCase();
    }
    answer += arr[index];
  }
  console.log(answer);
});