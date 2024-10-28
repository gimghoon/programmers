function solution(s) {
  let posornega = true;
  let sarr = s.split("");

  const reversesarr = (sarr) => {
    const maxidx = sarr.length - 1;
    for (let i = 0; i < parseInt(sarr.length / 2); i += 1) {
      [sarr[i], sarr[maxidx - i]] = [sarr[maxidx - i], sarr[i]];
    }
  };

  if (Number(sarr[0])) {
    reversesarr(sarr);
    return sarr
      .map((el, index) => Number(el) * 10 ** index)
      .reduce((prev, current) => prev + current);
  }
  posornega = sarr.shift() === "+" ? 1 : 0;

  reversesarr(sarr);

  const result = sarr
    .map((el, index) => Number(el) * 10 ** index)
    .reduce((prev, current) => prev + current);

  return posornega ? result : 0 - result;
}

