function solution(phone_number) {
  const arr = phone_number.split("");
  arr.splice(0, phone_number.length - 4, "*".repeat(phone_number.length - 4));

  return arr.join("");
}