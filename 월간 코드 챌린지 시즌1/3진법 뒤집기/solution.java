class Solution {
    public int solution(int n) {
        int answer = 0;

        int num = 0;
        for(int i=0;;i++) {
            num += (int)(Math.pow(3, i)*2);
            if(num > n) {
                num = i;
                break;
            }
        }

        int k = 0;
        for(int i = num; i >= 0; i--) {
            int compNum = (int) Math.pow(3, i);
            if(n - (compNum*2) >= 0) {
                n -= compNum*2;
                answer += (int) Math.pow(3, k)*2;
            } else if (n - compNum >= 0) {
                n -= compNum;
                answer += (int) Math.pow(3, k);
            }
            k++;
        }
        return answer;
    }
}
