import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> targetP = new ArrayList<>(Arrays.asList(participant));
        
        for(String c : completion) {
            targetP.remove(c);
        }
        return targetP.get(0);
    }
}

//remove에서 엄청 오래 걸린 것같음 효율성에서 탈락함
//문제 카테고리가 해시 라서 hashmap 써야되는건가? 라고 생각만하고 그게 이거보다 빠를줄은 상상도 못했음 결국 정답 찾아봤음
