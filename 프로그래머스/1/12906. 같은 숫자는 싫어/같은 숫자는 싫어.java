import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int currentValue = arr[0];
        list.add(currentValue);
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=currentValue) {
                currentValue = arr[i];
                list.add(currentValue);
            }
        }
        
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}