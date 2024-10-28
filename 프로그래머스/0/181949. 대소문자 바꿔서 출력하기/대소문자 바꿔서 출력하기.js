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
  arr = str.split("");
  arr.forEach((value, index) => {
    if (value === value.toUpperCase()) {
      arr[index] = value.toLowerCase();
    } else {
      arr[index] = value.toUpperCase();
    }
  });

  console.log(arr.join(""));
});