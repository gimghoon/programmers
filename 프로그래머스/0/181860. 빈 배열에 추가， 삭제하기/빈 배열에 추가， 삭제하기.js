function solution(arr, flag) {
  let x = [];
  arr.forEach((e, i) => {
    if (flag[i]) {
      for (let i = 0; i < e * 2; i++) {
        x.push(e);
      }
    } else {
     x=x.slice(0, x.length - e );
    }
  });

  return x;
}
