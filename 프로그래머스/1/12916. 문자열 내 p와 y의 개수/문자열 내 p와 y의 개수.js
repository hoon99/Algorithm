function solution(s){
    s = s.toLowerCase()
    let len = s.length
    let cnt = 0
    let answer
    for(let i=0; i<len; i++){
        if(s[i]==='p') cnt += 1
        else if(s[i]==='y') cnt -=1
    }
    if(cnt===0) {answer = true}
    else {answer = false}
    return answer;
}