function solution(nums) {
  const obj = {};
  nums.forEach((element) => {
    if (!obj[element]) {
      obj[element] = 0;
    }
  });

  var answer =
    nums.length / 2 <= Object.keys(obj).length
      ? nums.length / 2
      : Object.keys(obj).length;
  return answer;
}