function solution(name, yearning, photo) {
  let name_yearning = {};
  name.map((e, i) => {
    name_yearning[e] = yearning[i];
  });
  photo.map((element, i) => {
    photo[i] = element.reduce((acc, curr) => {
      if (!name_yearning[curr]) return acc;
      return acc + name_yearning[curr];
    }, 0);
  });
  return photo;
}
