class Solution {
    public long solution(long n) {
        return Math.sqrt(n) != (int) Math.sqrt(n) ? -1 : (long)Math.pow((long)(Math.sqrt(n)+1), 2L);
    }
}
