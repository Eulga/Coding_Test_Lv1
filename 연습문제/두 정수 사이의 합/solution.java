class Solution {
    public long solution(int a, int b) {
        if(a==b) return a;
//         long answer = 0;
//         for(int i = Math.min(a,b); i <= Math.max(a, b); i++) {
//             answer += (long) i;
//         }
//         return answer;
        
        return (Math.max(a,b) - Math.min(a,b) + 1) * (long)(a + b) / 2;
    }
}
