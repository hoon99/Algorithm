class Solution {
    public String solution(String s) {
        int wordIndex = 0;
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==' ') {
                wordIndex = 0;
            } else if(wordIndex % 2 == 0){
                arr[i] = Character.toUpperCase(arr[i]);
                wordIndex++;
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
                wordIndex++;
            }
        }
    
        return String.valueOf(arr);
    }
}