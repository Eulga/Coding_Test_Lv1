import java.util.*;

class Solution {
    public long solution(long n) {
        return Long.parseLong(String.join("", Arrays.stream(Long.toString(n).split("")).sorted(Comparator.reverseOrder()).toArray(String[]::new)));
    }
}
