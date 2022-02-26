class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < answer.length; i++) {
            for(int k = 0; k < answer[0].length; k++) {
                answer[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        return answer;
    }
}
