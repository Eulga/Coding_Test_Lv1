import java.util.*;
import java.util.Map.*;

// 와 진짜 너무 어려웠다
// 0/0 이 왜 0이 아니라 NaN 이냐고
// (N > stages안의 최대값) 이 조건 알아 차리는데 한 30분 걸린듯

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stayedUsers = new int[N];

        for(int stage : stages) {
            if(stage <= N) stayedUsers[stage-1]++;
        }

        int tryUser = stages.length;
        Double[] failRate = new Double[N];
        for(int r = 0; r < N; r++) {
            // N=7 stages = {5} -> 6,7 NaN tryUser>0 조건 추가 후 해결
            failRate[r] = tryUser>0? (double)stayedUsers[r] / (double)tryUser:0;
            tryUser -= stayedUsers[r];
        }

        HashMap<Integer, Double> abc = new HashMap<>();

        for(int r = 0; r < N; r++) {
            abc.put(r+1, abc.getOrDefault(r+1, 0.0)+failRate[r]);
        }

        List<Entry<Integer,Double>> abcEntryList = new LinkedList<>(abc.entrySet());
        abcEntryList.sort(((o1, o2) -> abc.get(o2.getKey()).compareTo(abc.get(o1.getKey()))));

        int[] answer = new int[N];
        int i = 0;
        for(Entry<Integer, Double> e : abcEntryList) {
            answer[i] = e.getKey();
            i++;
        }
        return answer;
    }
}
