function solution(arr) {
  let count = 0;
  const compund = [arr];
  while (1) {
    let carr = compund[count];
    const nextarr = [...carr].map((e) => {
      if (e >= 50 && e % 2 === 0) return e / 2;
      else if (e < 50 && e % 2 === 1) return e * 2 + 1;
      else return e;
    });
    if (JSON.stringify([...carr]) === JSON.stringify([...nextarr]))
      return count;
    else {
      count++;
      compund.push(nextarr);
    }
  }
}