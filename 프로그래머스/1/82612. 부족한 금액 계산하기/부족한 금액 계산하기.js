function solution(price, money, count) {
  let priceneed = 0;
  for (let i = 0; i < count; i++) {
    priceneed += (i + 1) * price;
  }

  if (priceneed - money < 0) return 0;
  return priceneed - money;
}