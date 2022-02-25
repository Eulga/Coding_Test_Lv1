import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(char a : Integer.toString(n).toCharArray()) {
            answer += a-48;
        }
        return answer;
    }
}
