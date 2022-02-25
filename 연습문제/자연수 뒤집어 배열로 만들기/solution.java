class Solution {
    public int[] solution(long n) {
        char[] nc = Long.toString(n).toCharArray();
        int nclen = nc.length;
        int[] answer = new int[nclen];
        
        for(char a : nc) {
            answer[--nclen] = a-48;
        }
        return answer;
    }
}
