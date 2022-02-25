import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> numberSet = new HashSet<>();
        for(int i = 0; i < numbers.length-1; i++) {
            for(int k = i+1; k < numbers.length; k++) {
                numberSet.add(numbers[i]+numbers[k]);
            }
        }
        
        int[] answer = numberSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
