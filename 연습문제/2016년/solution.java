//LocalDate.of(2016, 5, 24).getDayOfWeek().toString().substring(0,3)
//실제로 날짜를 구할 일이 있다면 위의 코드가 제일 좋다고 생각함

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
