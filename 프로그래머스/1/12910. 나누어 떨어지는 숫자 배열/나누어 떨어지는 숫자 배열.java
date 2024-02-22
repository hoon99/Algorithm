import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num % divisor == 0) list.add(num);
        }
        if(list.size()==0) {
            list.add(-1);
        } else Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}