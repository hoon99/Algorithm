class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);
        long tValue;
        
        for(int i=0; i<t.length()-p.length()+1; i++) {
            tValue = Long.parseLong(t.substring(i,i+p.length()));
            if(tValue <= pValue) answer++;
        }
        
        return answer;
    }
}