function solution(s, skip, index) {
  let alpha = "abcdefghijklmnopqrstuvwxyz";
  const skiparr = skip.split("");
  const alphaarr = alpha.split("").filter((e) => ![...skiparr].includes(e));

  let alphac = alphaarr.concat(alphaarr);
  s = s
    .split("")
    .map((e) => {
      return alphac[(alphac.indexOf(e) + index) % alphac.length];
    })
    .join("");
  return s;
}

