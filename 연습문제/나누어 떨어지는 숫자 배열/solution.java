import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();
        
        for(int a : arr) {
            if(a%divisor == 0) answerList.add(a);
        }
        if(answerList.isEmpty()) answerList.add(-1);
        
        answerList.sort(Comparator.naturalOrder());
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
