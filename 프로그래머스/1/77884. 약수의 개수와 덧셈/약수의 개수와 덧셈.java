class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // for문 돌면서 제곱수인지 판단 (*제곱수의 약수의 개수는 홀수)
        for (int i=left; i<=right; i++){
            if(isSquareNumber(i)) answer -= i;
            else answer += i;
        }
        
        return answer;
    }
    
    public boolean isSquareNumber(int num){
        for(int i=1; i<=num/2+1; i++){
            if(num == Math.pow(i, 2)) return true;
        }
        return false;
    }
}