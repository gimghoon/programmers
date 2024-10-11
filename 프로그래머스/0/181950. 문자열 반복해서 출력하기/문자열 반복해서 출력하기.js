const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
}).on("close", function () {
  let answer = "";
  str = input[0];
  n = Number(input[1]);
  while (n > 0) {
    answer += str;
    n--;
  }
  console.log(answer);
});

