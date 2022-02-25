class Solution {
    public int solution(int n) {
        int answer = 1+n;
        if(n < 2) return n;
        if(isPrime(n)) return n+1;
        
        for(int i = 2; i <= n/2; i++) {
            answer += n%i == 0 ? i:0;
        }
        
        return answer;
    }
    
    public boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
