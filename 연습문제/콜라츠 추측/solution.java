class Solution {
    public int solution(int num) {
        return collatz(num, 0);
    }
    
    public int collatz (long num, int cnt) {
        if(num == 1 || cnt == 500) {
            if(num > 1) return -1;
            return cnt;
        }
        if(num%2 == 0) num = num/2;
        else num = num*3+1;
        
        return collatz(num, ++cnt);
    }
}
