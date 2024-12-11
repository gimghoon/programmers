
function solution(keymap, targets) {
  let objcharMin = {};
  keymap.map((e) =>
    e.split("").map((element, i) => {
      console.log(element, i);
      if (!objcharMin[element]) objcharMin[element] = i + 1;
      else {
        objcharMin[element] =
          objcharMin[element] <= i + 1 ? objcharMin[element] : i + 1;
      }
    })
  );

  var answer = [];
  answer = targets.map((e) => {
    let tmp = e.split("").map((e) => (objcharMin[e] ? objcharMin[e] : -1));
    return (e = tmp.includes(-1) ? -1 : tmp.reduce((a, c) => a + c));
  });
  return answer;
}