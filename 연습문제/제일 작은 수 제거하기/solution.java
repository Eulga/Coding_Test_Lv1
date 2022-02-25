import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        
        int min = arr[0];
        for(int a : arr) {
            min = Math.min(min, a);
        }
        List<Integer> abc = Arrays.stream(arr).boxed().collect(Collectors.toList());
        abc.remove(abc.indexOf(min));
        return abc.stream().mapToInt(Integer::intValue).toArray();
    }
}
