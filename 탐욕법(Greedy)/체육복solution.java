import java.util.*;
// lost      2 3
// reserve 1 2

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int k = 0; k < lost.length; k++) {
            for(int i = 0; i < reserve.length; i++) {
                if(lost[k] == reserve[i]) {
                    lost[k] = -1;
                    reserve[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int l : lost) {
            for(int i = 0; i < reserve.length; i++) {
                if(Math.abs(l-reserve[i]) == 1) {
                    answer++;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
