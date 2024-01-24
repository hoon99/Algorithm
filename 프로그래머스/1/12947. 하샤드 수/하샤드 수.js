function solution(x) {
    let a = x
    let num = 0
    let len = x.toString().length
    for(let i=0; i<len;i++){
        num += a%10
        a = Math.floor(a/10)
    }
    if(x%num===0) return true
    return false
}