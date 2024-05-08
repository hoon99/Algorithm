import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int current = stack.pop();
                result[current] = i - current;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            int current = stack.pop();
            result[current] = n - 1 - current;
        }
        
        return result;
    }
}