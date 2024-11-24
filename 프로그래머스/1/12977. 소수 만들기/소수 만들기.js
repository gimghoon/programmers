function solution(nums) {
  var result = 0;
  function isPrime(num) {
    if (num === 2) {
      return true;
    }
    for (let i = 2; i <= Math.floor(Math.sqrt(num)); i++) {
      if (num % i === 0) {
        return false;
      }
    }
    return true;
  }
  function combination(current, start) {
    if (current.length === 3) {
      result += isPrime(current.reduce((acc, curr) => acc + curr)) ? 1 : 0;
      return;
    }
    for (let i = start; i < nums.length; i++) {
      combination([...current, nums[i]], i + 1);
    }
  }
  combination([], 0);

  return result;
}