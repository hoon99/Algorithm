import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        
        for(int i=0; i<arr.length; i++) {
         if(validator(arr, i)) result++;   
        }
        
        return result;
    }
    
    public boolean validator(char[] arr, int x) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            char c = arr[(i-x+arr.length) % arr.length];
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                switch(stack.pop()) {
                    case '(': if(c != ')') return false;
                        break;
                    case '{': if(c != '}') return false;
                        break;
                    case '[': if(c != ']') return false;
                        break;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}