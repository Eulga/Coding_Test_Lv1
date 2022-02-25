import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length/2;
        
        HashSet<Integer> setnums = new HashSet<Integer>();
        
        for(int i : nums) {
            setnums.add(i);
        }
        
        return setnums.size()>=n? n:setnums.size();
    }
}
