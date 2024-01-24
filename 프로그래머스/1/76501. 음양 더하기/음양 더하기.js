function solution(absolutes, signs) {
    let len = absolutes.length
    let ans = 0
    for(let i=0; i<len; i++){
        if (signs[i]===true) ans += absolutes[i]
        else ans -= absolutes[i]
    }
    return ans
}