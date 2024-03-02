import java.util.*;

class Solution {
    public String solution(String s) {
 
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        
        String answer = "";
        for(int i=chars.length-1; i>=0; i--){
            answer += chars[i];
        }
 
        return answer;
    }
}