class Solution {
    public String solution(String[] seoul) {
//         String answer = "김서방은 ";
//         for(int i = 0; i < seoul.length; i++) {
//             if(seoul[i].equals("Kim")) {answer += i+"에 있다"; break;}
//         }
//         return answer;
        
           return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
