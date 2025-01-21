function solution(s) {
  const twoS = s.concat(s);
  const sL = s.length;
  let countO = 0;
  for (let k = 0; k < sL; k++) {
    countO += check(twoS.slice(k, k + sL)) > 0 ? 1 : 0;
  }
  function check(s) {
    
    let sdup = s;
 
    let indexofsmall = 0;
    let indexofmid = 0;
    let indexofbig = 0;
    for (let i = 0; i < s.length / 2; i++) {

      indexofsmall = sdup.indexOf("()");
      indexofmid = sdup.indexOf("{}");
      indexofbig = sdup.indexOf("[]");



      if (indexofsmall >= 0) {
        sdup = sdup.replace("()", "");
      }
      if (indexofmid >= 0) {
        sdup = sdup.replace("{}", "");
      }
      if (indexofbig >= 0) {
        sdup = sdup.replace("[]", "");
      }

    }
  
    return sdup.length > 0 ? -1 : 1;
  }
  return countO;
}

