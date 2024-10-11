const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
}).on("close", function () {
  const num1 = Number(input[0]);
  const num2 = Number(input[1]);
  if (isNaN(num1) || isNaN(num2)) {
    console.log("Error: Both inputs must be valid numbers.");
  } else {
    console.log(`${num1} + ${num2} = ${num1 + num2}`);
  }
});