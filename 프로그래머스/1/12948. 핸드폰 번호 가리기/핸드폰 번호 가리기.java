class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = phone_number.substring(len-4);
        for(int i=0; i<len-4; i++){
            answer = "*" + answer;
        }
        return answer;
    }
}