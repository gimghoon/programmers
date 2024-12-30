function solution(s) {
  let [index, count] = [0, 0];

  while (s !== "1") {
    index += 1;
    count += [...s].filter((v) => v === "0").length;

    s = [...s]
      .filter((v) => v === "1")
      .join("")
      .length.toString(2);
  }

  return [index, count];
}