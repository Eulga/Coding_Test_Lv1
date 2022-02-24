import java.util.*;

class Solution {
    public String solution(String s) {
        return String.join("", Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).toArray(String[]::new));
    }
}
