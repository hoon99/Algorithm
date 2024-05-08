import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] left = new int[n];
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        for(int i=0; i<n; i++) {
            left[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int current = 0;
        int count = 0;
        
        for(int i=0; i<n; i++) {
            if(left[i] <= left[current]) {
                count++;
            } else {
                queue.add(count);
                count = 1;
                current = i;
            }
        }
        
        queue.add(count);
        
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}