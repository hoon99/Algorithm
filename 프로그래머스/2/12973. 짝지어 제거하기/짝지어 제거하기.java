import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr) {
            if(stack.isEmpty() || c!=stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        
        if(stack.isEmpty()) return 1;
        
        return 0;
    }
}