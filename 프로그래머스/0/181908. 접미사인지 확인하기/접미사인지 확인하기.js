function solution(my_string, is_suffix) {
    const start=my_string.length-is_suffix.length
    

    return my_string.slice(start)===is_suffix?1:0;
}