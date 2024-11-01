function solution(sizes) {
  let maxofbig = 0;
  let maxofsmall = 0;
  sizes.forEach((element) => {
    element.sort((a, b) => a - b);
    if (maxofbig <= element[1]) {
      maxofbig = element[1];
    }
    if (maxofsmall <= element[0]) {
      maxofsmall = element[0];
    }
  });
  return maxofbig * maxofsmall;
}

