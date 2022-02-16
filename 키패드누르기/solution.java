// 1 2 3
// 4 5 6
// 7 8 9
// * 0 #

// (0,0) (0,1) (0,2)
// (1,0) (1,1) (1,2)
// (2,0) (2,1) (2,2)
// (3,0) (3,1) (3,2)

enum KeyNumber {
    ONE("00"),
    TWO("01"),
    THREE("02"),
    FOUR("10"),
    FIVE("11"),
    SIX("12"),
    SEVEN("20"),
    EIGHT("21"),
    NINE("22"),
    ZERO("31");

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
        int[] numbers = {1, 3, 4, 1, 4, 9};
        String hand = "right";
        String left = "";
        String right = "";

        String answer = "";

        for(int n : numbers) {
            switch(n) {
                case 1: left = KeyNumber.ONE.getValue();
                        answer += 'L';
                        break;
                case 3: right = KeyNumber.THREE.getValue();
                        answer += 'R';
                        break;
                case 4: left = KeyNumber.FOUR.getValue();
                        answer += 'L';
                        break;
                case 6: right = KeyNumber.SIX.getValue();
                        answer += 'R';
                        break;
                case 7: left = KeyNumber.SEVEN.getValue();
                        answer += 'L';
                        break;
                case 9: right = KeyNumber.NINE.getValue();
                        answer += 'R';
                        break;
                default: answer += getFinger(n, left, right, hand);
            }
            System.out.println(left + " " + right);
        }
        System.out.println(answer);
    }

    public static String getFinger(int n, String left, String right, String hand) {
        
        return "";
    }
}

