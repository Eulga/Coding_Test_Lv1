import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stackArr = new Stack<>();

        for(int a : arr) {
            if(stackArr.empty()) {
                stackArr.push(a);
                continue;
            }
            if(stackArr.peek() == a) continue;
            stackArr.push(a);
        }

        return stackArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
