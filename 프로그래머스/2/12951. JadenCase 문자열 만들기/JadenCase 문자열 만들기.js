function solution(s) {
  s = s
    .split(" ")
    .map((e) => {
      let firstel = !(e.charAt(0) > 96)
        ? e.slice(0, 1).toUpperCase()
        : e.slice(0, 1);

      return firstel + e.slice(1).toLowerCase();
    })

    .join(" ");

  return s;
}