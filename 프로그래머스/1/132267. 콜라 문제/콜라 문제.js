
function solution(a, b, n) {
  let acc = 0;
  function changecola(n) {
    if (n < a) return acc;
    acc += Math.floor(n / a) * b;
    n += Math.floor(n / a) * (b - a);
    return changecola(n);
  }

  return changecola(n);
}                                                                                                                            
