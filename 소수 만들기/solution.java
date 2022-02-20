class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int a = 0; a < nums.length-2; a++) {
            for(int b = a+1; b < nums.length-1; b++) {
                for(int c = b+1; c < nums.length; c++) {
                    answer += checkPrimeNumber(nums[a] + nums[b] + nums[c]) ? 1:0;
                }
            }
        }
        
        return answer;
    }
    
    public boolean checkPrimeNumber(int num) {
        for(int i=num-1; i>1; i--) {
            if(num%i == 0) return false;
        }
        return true;
    }
    
}
