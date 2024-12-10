function solution(n) {
   
return (n + "").split("").reduce((a, c) =>a + parseInt(c),0);
}