class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 32) continue;
            if(arr[i] >= 97) {
                arr[i] = (char) ((arr[i] + n - 97) % 26 + 97);
            } else {
                arr[i] = (char) ((arr[i] + n - 65) % 26 + 65);
            }
        }
        return String.valueOf(arr);
    }            
}