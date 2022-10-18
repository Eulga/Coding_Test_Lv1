class Solution {
    public String solution(int n) {
        char[] nc = new char[n];
        
        for(int i = 0; i < n; i++) {
            nc[i] = i%2==0? '수':'박';
        }
        
        return new String(nc);
        }
}
