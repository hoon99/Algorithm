class Solution {
    public int[] solution(String s) {
        StringBuffer sb = new StringBuffer();
        int[] arr = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            String letter = s.substring(i,i+1);
            int idx = sb.lastIndexOf(letter);
            if(idx == -1) {
                arr[i] = -1;
            } else {
                arr[i] = i-idx;
            }
            sb.append(letter);
        }
        
        return arr;
    }
}