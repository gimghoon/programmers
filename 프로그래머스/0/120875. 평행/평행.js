function solution(dots) {
  //두 점의 인덱스가 주어지면 두점을 이은 직선의 각도를 반환하는 함수
  const angle = (a, b) => (dots[a][0] - dots[b][0]) / (dots[a][1] - dots[b][1]);

  //직선을 만들 수 있는 모든 방법을 인덱스로 표현하고, 모두 확인
  for (const [a1, b1, a2, b2] of [
    [0, 1, 2, 3],
    [0, 2, 1, 3],
    [0, 3, 1, 2]
  ]) {
    //만약 두 직선의 각도가 같다면 1을 반환
    if (angle(a1, b1) === angle(a2, b2)) {
      return 1;
    }
  }

  //두 직선의 각도가 같은 조합이 없는 경우 0을 반환
  return 0;
}