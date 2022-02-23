class Solution {
    public String solution(int a, int b) {
        String[] date = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        switch(a-1) {
            case 12: b += 31;
            case 11: b += 30;
            case 10: b += 31;
            case 9: b += 30;
            case 8: b += 31;
            case 7: b += 31;
            case 6: b += 30;
            case 5: b += 31;
            case 4: b += 30;
            case 3: b += 31;
            case 2: b += 29;
            case 1: b += 31;
            break;
            default: b += 0;
        }
        
        return date[b%7];
    }
}
