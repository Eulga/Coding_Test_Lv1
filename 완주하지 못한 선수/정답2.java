import java.util.*;

//이 문제는 정렬 활용하게 하려는게 주 목적이었던 것 같다. 모범답안이 거의 정렬이었음

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
                    
        int i = 0;
        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}
