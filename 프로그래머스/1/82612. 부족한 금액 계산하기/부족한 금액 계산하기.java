class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long fee = 0;
        
        for(int i=1; i<=count; i++){
            fee += price*i;
        }
        
        if(fee > money) {
            answer = fee - money;
            return answer;
        } else return 0;
            
    }
}