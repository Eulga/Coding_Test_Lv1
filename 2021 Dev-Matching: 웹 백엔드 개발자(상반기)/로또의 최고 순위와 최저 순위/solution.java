class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int countNumber = 6;
        int countZero = 0;
        for(int item : lottos) {
            if(item==0) { countZero++; continue; }
            for(int check : win_nums) {
                if(item==check) countNumber--;
            }
        }
        int min = 6;
        int max = 6;
        if(countNumber < 5) min = countNumber+1;
        if(countNumber-countZero < 5) max = countNumber-countZero+1;
        return new int[] {max, min};
    }
}
