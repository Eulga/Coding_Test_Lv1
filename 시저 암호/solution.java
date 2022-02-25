class Solution {
    public String solution(String s, int n) {
        char[] as = s.toCharArray();
        for(int i = 0; i < as.length; i++) {
            if(as[i] == ' ') continue;
            for(int k = 1; k <= n; k++) {
                as[i]++;
                if(as[i] > 'z') {
                    as[i] = 'a';   
                } else if(as[i] > 'Z' && as[i] < 'a') {
                    as[i] = 'A';
                }
            }
        }
        return new String(as);
    }
}
