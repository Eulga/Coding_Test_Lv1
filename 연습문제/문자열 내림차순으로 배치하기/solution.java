import java.util.*;

class Solution {
    public String solution(String s) {
        return String.join("", Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).toArray(String[]::new));
        
        // return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        // 속도 비슷한데 Collectors 를 사용함
    }
}

// char[] sol = str.toCharArray();
// Arrays.sort(sol);
// return new StringBuilder(new String(sol)).reverse().toString();
// 빠름


