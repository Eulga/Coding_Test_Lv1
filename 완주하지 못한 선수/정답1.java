import java.util.*;

//HashMap으로 해야하나? 라고 생각했을 때 떠올린 방식 그대로가 정답이었음
//어이가 아리마셍;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> list = new HashMap<>();
        
        String answer = "";
        
        for(String p : participant) list.put(p, list.getOrDefault(p, 0) + 1);
        for(String c : completion) list.put(c, list.get(c) -1);
        for(String key : list.keySet()) {
            if(list.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
