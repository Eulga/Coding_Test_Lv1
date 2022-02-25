class Solution {
    public int solution(int[] numbers) {
        String a = "0123456789";

        for(int n : numbers) {
            switch(n) {
                case 0 : a = a.replace("0", "");
                break;
                case 1 : a = a.replace("1", "");
                break;
                case 2 : a = a.replace("2", "");
                break;
                case 3 : a = a.replace("3", "");
                break;
                case 4 : a = a.replace("4", "");
                break;
                case 5 : a = a.replace("5", "");
                break;
                case 6 : a = a.replace("6", "");
                break;
                case 7 : a = a.replace("7", "");
                break;
                case 8 : a = a.replace("8", "");
                break;
                case 9 : a = a.replace("9", "");
                break;
            }
        }

        int answer = 0;
        for(String s : a.split("")) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
