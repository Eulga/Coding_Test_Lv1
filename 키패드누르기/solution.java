package com.example;

// 1 2 3
// 4 5 6
// 7 8 9
// * 0 #

// (0,0) (0,1) (0,2)
// (1,0) (1,1) (1,2)
// (2,0) (2,1) (2,2)
// (3,0) (3,1) (3,2)

enum KeyNumber {
    ZERO("31"),
    ONE("00"),
    TWO("01"),
    THREE("02"),
    FOUR("10"),
    FIVE("11"),
    SIX("12"),
    SEVEN("20"),
    EIGHT("21"),
    NINE("22");

    private final String value;

    KeyNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class App 
{
    public static void main( String[] args )
    {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String left = "30";
        String right = "32";

        String finger = "";
        String number = "";

        String answer = "";

        hand = hand.equals("right") ? "R":"L";

        for(int n : numbers) {
            switch(n) {
                case 1: left = KeyNumber.ONE.getValue();
                        answer += 'L';
                        continue;
                case 2: number = KeyNumber.TWO.getValue();
                        break;
                case 3: right = KeyNumber.THREE.getValue();
                        answer += 'R';
                        continue;
                case 4: left = KeyNumber.FOUR.getValue();
                        answer += 'L';
                        continue;
                case 5: number = KeyNumber.FIVE.getValue();
                        break;
                case 6: right = KeyNumber.SIX.getValue();
                        answer += 'R';
                        continue;
                case 7: left = KeyNumber.SEVEN.getValue();
                        answer += 'L';
                        continue;
                case 8: number = KeyNumber.EIGHT.getValue();
                        break;
                case 9: right = KeyNumber.NINE.getValue();
                        answer += 'R';
                        continue;
                case 0: number = KeyNumber.ZERO.getValue();
                        break;
                default: answer += "";
            }
            finger = getMoveResult(number.split(""), left.split(""), right.split(""), hand);
            if(finger.equals("R")) {
                right = number;
            } else {
                left = number;
            }
            answer += finger;
        }
        System.out.println(answer);
    }

    public static String getMoveResult(String[] number, String[] left, String[] right, String hand) {
        int number1 = Integer.parseInt(number[0]);
        int number2 = Integer.parseInt(number[1]);
        int left1 = Integer.parseInt(left[0]);
        int left2 = Integer.parseInt(left[1]);
        int right1 = Integer.parseInt(right[0]);
        int right2 = Integer.parseInt(right[1]);

        int resultLeft = Math.abs(number1 - left1) + Math.abs(number2 - left2);
        int resultRight = Math.abs(number1 - right1) + Math.abs(number2 - right2);

        System.out.println(resultLeft + " " + resultRight);
        
        if(resultLeft == resultRight) return hand;

        return resultLeft > resultRight ? "R":"L";
    }
    /**
        2580은 왼손 오른손 위치랑 숫자 위치랑 비교해서 가까운걸 뽑아내야한다 return finger;
        if(finger.equals("R")) {
            right = number;
        } else {
            left = number;
        }
        answer += finger;
     */
}
