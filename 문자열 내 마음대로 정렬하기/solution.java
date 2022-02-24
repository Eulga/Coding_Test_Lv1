import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answerList = new ArrayList<>(Arrays.asList(strings));
        Collections.sort(answerList, new MySort(n));
        return answerList.toArray(new String[answerList.size()]);
    }
}

class MySort implements Comparator<String> {
    private int a;

    public MySort(int a) {
        this.a = a;
    }

    @Override
    public int compare(String s1, String s2) {
        if(s1.charAt(a) > s2.charAt(a)) {
            return 1;
        } else if (s1.charAt(a) < s2.charAt(a)){
            return -1;
        } else {
            return s1.compareTo(s2);
        }
    }
}
