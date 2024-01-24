function solution(n) {
    let str = n.toString()
    let len = str.length
    let ans = []
    for(let i=0; i<len; i++){
        ans[i]=n%10
        n = Math.floor(n/10)
    }
    return ans
}