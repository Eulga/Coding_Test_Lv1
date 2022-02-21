import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scoreSupo = {0,0,0};
        
        int one=0;
        int two=0;
        int three=0;
        
        for(int a : answers) {
            scoreSupo[0] += supo1[one++]==a? 1:0;
            scoreSupo[1] += supo2[two++]==a? 1:0;
            scoreSupo[2] += supo3[three++]==a? 1:0;
            
            if(one>=supo1.length) one=0;
            if(two>=supo2.length) two=0;
            if(three>=supo3.length) three=0;
        }
        
        int maxScore = Math.max(scoreSupo[0], Math.max(scoreSupo[1], scoreSupo[2]));
        
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<3; i++) {
            if(scoreSupo[i]==maxScore) answer.add(i+1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
