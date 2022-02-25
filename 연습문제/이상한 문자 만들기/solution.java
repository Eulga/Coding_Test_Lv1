class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        boolean up = true;
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                up = true;
                continue;
            }
            if(up) {
                c[i] -= (int)c[i] >= (int)'a' ? 32:0;
                up = false;
            } else {
                c[i] += (int)c[i] <= (int)'Z' ? 32:0;
                up = true;
            }
        }
        return new String(c);
    }
}
