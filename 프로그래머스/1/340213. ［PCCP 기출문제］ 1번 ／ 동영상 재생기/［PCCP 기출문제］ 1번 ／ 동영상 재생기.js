
function solution(video_len, pos, op_start, op_end, commands) {
  function checkifopening(pos) {
    return pos >= op_start && pos <= op_end ? op_end : pos;
  }
  function changetoclockform(pos) {
    if (+pos.slice(3, 4) >= 6) {
      //분이 60이상일떄
      pos =
        pos.slice(0, 1) +
        String(+pos.slice(1, 2) + 1) +
        ":" +
        String(+pos.slice(3, 4) - 6) +
        pos.slice(-1);
      if (pos.slice(2) === "0") {
        pos = String(+pos.slice(0, 1) + 1) + pos.slice(2);
      }
    }
    if (pos >= video_len) {
      return video_len;
    }
    if (pos.slice(3, 4) === "-") {
      // 분이 -값을 가질떄
      if (pos.slice(1, 2) === "0") {
        if (pos.slice(0, 1) === "0") {
          pos = "00:00";
          return pos;
        }
        pos = String(+pos.slice(0, 1) - 1) + "9:5" + pos.slice(-1);
      } else {
        pos =
          pos.slice(0, 1) +
          String(+pos.slice(1, 2) - 1) +
          ":" +
          "5" +
          pos.slice(-1);
      }
    }
    return pos;
  }
  function commands_run(commands) {
    console.log(pos);
    if (commands === "next") {
      pos = pos.slice(0, 3) + String(+pos.slice(3, 4) + 1) + pos.slice(-1);
    } else {
      pos = pos.slice(0, 3) + String(+pos.slice(3, 4) - 1) + pos.slice(-1);
    }
    return pos;
  }
  pos = checkifopening(pos);
  for (let i = 0; i < commands.length; i++) {
    pos = commands_run(commands[i]);
    pos = changetoclockform(pos);
    pos = checkifopening(pos);
  }
  return pos;
}