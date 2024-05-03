import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        Integer[] result = list.toArray(new Integer[set.size()]);
        
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}