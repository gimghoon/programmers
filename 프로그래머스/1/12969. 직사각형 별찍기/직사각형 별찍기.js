process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = data.split(" ");
  const a = Number(n[0]),
    b = Number(n[1]);
  const s = "*".repeat(a);
  let bc = b;
  while (bc > 0) {
    console.log(`${s}`);
    bc--;
  }
});