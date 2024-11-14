function solution(n, m, section) {
    let answer = 0;
    const wall = Array.from({length: n}, (_, i) => i + 1);

    section.forEach((v) => {
        wall[wall.indexOf(v)] = 0;
    });

    for (let i = 0; i < wall.length; i++) {
        if (wall[i] === 0) {
            for (let j = i; j < wall.length && j < i + m; j++) {
                wall[j] += 1;
            }
            answer += 1;
        } else {
            continue
        }
    }
    return answer;
}