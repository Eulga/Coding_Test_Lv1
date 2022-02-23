import java.util.*;

class Solution {
    public int solution(String dartResult) {
        String[] resultArray = dartResult.split("");
        List<Integer> answerList = new ArrayList<>();
        
        int number = 0;
        int eventNum = 0;
        int listSize = 0;
        for(int i = 0; i < resultArray.length; i++) {
            if(resultArray[i].matches("\\d")) {
                if(Integer.parseInt(resultArray[i]) == 0 && number == 1) {
                    number = 10;
                } else {
                    number = Integer.parseInt(resultArray[i]);
                }
                eventNum = 0;
            }
            else {
                switch(resultArray[i]) {
                    case "T": eventNum++;
                    case "D": eventNum++;
                    case "S": eventNum++;
                    answerList.add((int) Math.pow(number, eventNum));
                    listSize++;
                    break;
                    case "*": answerList.set(listSize-1, answerList.get(listSize-1)*2);
                    if(listSize>1) {
                        answerList.set(listSize-2, answerList.get(listSize-2)*2);
                    }
                    break;
                    case "#": answerList.set(listSize-1, answerList.get(listSize-1)*-1);
                    break;
                }
            }
        }
        return answerList.stream().reduce(0, Integer::sum);
    }
}
