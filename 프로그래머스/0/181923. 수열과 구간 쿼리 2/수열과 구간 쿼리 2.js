function solution(arr, queries) {
  return queries.map((el) => {
    arrtmp = [...arr]
      .filter((e, i) => el[0] <= i && i <= el[1] && e > el[2])
      .sort((a, b) => a - b);
    return !arrtmp.length ? -1 : arrtmp[0];
  });
}
