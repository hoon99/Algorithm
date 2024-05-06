import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        
        for (char c : arr) {
            if (c == '(') {
                stack.push(1);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) return true;
        
        return false;
    }
}