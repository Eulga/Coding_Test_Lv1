import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int dItem : d) {
            if(budget-dItem >= 0) {
                budget -= dItem;
                answer++;
            }
        }
        return answer;
    }
}
