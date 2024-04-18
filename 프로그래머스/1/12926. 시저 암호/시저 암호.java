class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ' ') continue;
            if(arr[i] >= 'a' && arr[i]<='z') {
                arr[i] = (char) ((arr[i] + n - 'a') % ('z'-'a'+1) + 'a');
            } else {
                arr[i] = (char) ((arr[i] + n - 'A') % ('Z'-'A'+1) + 'A');
            }
        }
        return String.valueOf(arr);
    }            
}