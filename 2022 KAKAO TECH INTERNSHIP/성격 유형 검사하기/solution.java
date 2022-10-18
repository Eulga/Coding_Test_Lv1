import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int lan = survey.length;
        Map<String, Integer> kbti = new HashMap<>();
        kbti.put("R",0); kbti.put("T",0);
        kbti.put("C",0); kbti.put("F",0);
        kbti.put("J",0); kbti.put("M",0);
        kbti.put("A",0); kbti.put("N",0);

        for (int i = 0; i < lan; i++) {
            if(choices[i] == 4) continue;
            switch (choices[i] - 4) {
                case -3:
                    kbti.put(survey[i].substring(0,1),kbti.get(survey[i].substring(0,1))+3);
                    break;
                case -2:
                    kbti.put(survey[i].substring(0,1),kbti.get(survey[i].substring(0,1))+2);
                    break;
                case -1:
                    kbti.put(survey[i].substring(0,1),kbti.get(survey[i].substring(0,1))+1);
                    break;
                case 1:
                    kbti.put(survey[i].substring(1),kbti.get(survey[i].substring(1))+1);
                    break;
                case 2:
                    kbti.put(survey[i].substring(1),kbti.get(survey[i].substring(1))+2);
                    break;
                case 3:
                    kbti.put(survey[i].substring(1),kbti.get(survey[i].substring(1))+3);
                    break;
                default:
                    System.out.println("잘못된 값이 입력되었음");
                    return "";
            }
        }
        if (kbti.get("R") >= kbti.get("T")) answer+="R";
        else answer+="T";
        if (kbti.get("C") >= kbti.get("F")) answer+="C";
        else answer+="F";
        if (kbti.get("J") >= kbti.get("M")) answer+="J";
        else answer+="M";
        if (kbti.get("A") >= kbti.get("N")) answer+="A";
        else answer+="N";
        
        return answer;
    }
}
