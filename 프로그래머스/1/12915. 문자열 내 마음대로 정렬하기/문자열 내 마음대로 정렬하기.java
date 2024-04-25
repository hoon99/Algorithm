class Solution {
    public String[] solution(String[] strings, int n) {
        for (int i=strings.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                char left = strings[j].charAt(n);
                char right = strings[j+1].charAt(n);
                
                if(left > right || (left == right && strings[j].compareTo(strings[j+1]) > 0)) {
                    String tmp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = tmp;
                    
                }
            }
        }
        
        return strings;
    }
}