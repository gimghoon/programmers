function solution(clothes) {
  const clothesObj = {};

  clothes.forEach((element) => {
    clothesObj[element[1]] = (clothesObj[element[1]] || 0) + 1;
  });
  

  return Object.values(clothesObj).reduce((a, c) => a * (c + 1),1) - 1;
}