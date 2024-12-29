
function solution(n) {
    let answer = 0;
    const number = [0, 1];
    for(let i = 2; i <= n; i++){
        number.push((number[i-1] + number[i-2]) % 1234567);
    }
    answer = number[n];

    return answer;
}