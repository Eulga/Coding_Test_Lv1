class Solution {
    boolean solution(String s) {
        int a = 0;
        
        for(char c : s.toLowerCase().replaceAll("[^py]", "").toCharArray()) {
            if(c == 'p') a++;
            else a--;
        }
        return a==0? true:false;
    }
}
