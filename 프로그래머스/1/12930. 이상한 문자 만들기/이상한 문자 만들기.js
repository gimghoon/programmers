function solution(s) {
  s = s
    .split(" ")
    .map((v) =>
      v
        .split("")
        .map((c, index) => {
          if (index % 2 == 1) {
            return c.toLowerCase();
          } else {
            return c.toUpperCase();
          }
        })
        .join("")
    )

    .join(" ");
  return s;
}