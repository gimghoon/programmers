function solution(spell, dic) {
  const dicArray = dic.filter((e) => e.length === spell.length);
  console.log(dicArray);

  for (let i = 0; i < dicArray.length; i++) {
 
    if (
      JSON.stringify(dicArray[i].split("").sort()) ===
      JSON.stringify(spell.sort())
    )
      return 1;
  }

  return 2;
}