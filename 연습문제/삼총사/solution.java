class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length-2; i++) {
            int trio = number[i];
            for (int j = i+1; j < number.length-1; j++) {
                trio+=number[j];
                for (int k = j+1; k < number.length; k++) {
                    trio+=number[k];
                    if(trio == 0) answer++;
                    trio-=number[k];
                }
                trio-=number[j];
            }
        }
        
        return answer;
    }
}
