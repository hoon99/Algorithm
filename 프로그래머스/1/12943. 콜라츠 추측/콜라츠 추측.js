let cnt = 0

function solution(num) {
    if(num===1&&cnt<501) return cnt
    else if(num===1&&cnt>500) return -1
    else if (num%2===0) {
        cnt += 1
        return solution(num/2)
    }
    else {
        cnt += 1
        return solution(3*num+1)
    }
}