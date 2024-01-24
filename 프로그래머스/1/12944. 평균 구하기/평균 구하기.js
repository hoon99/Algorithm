function solution(arr) {
    let answer = arr.reduce((acc, curr) => acc + curr, 0)/arr.length;
    return answer;
}