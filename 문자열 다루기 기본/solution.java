class Solution {
    public boolean solution(String s) {
//         if(s.length() != 4 && s.length() != 6) return false;
//         try {
//             Integer.parseInt(s);
//             return true;
//         } catch(NumberFormatException e) {
//             return false;
//         }
        // 예외처리로 장난치면 혼난다고 한다.
        
           return s.length() == 4 || s.length() == 6 ? s.matches("(^[0-9]*$)"):false;
    }
    
    
}
