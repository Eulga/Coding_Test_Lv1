import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int crane = 0;

        int answer = 0;
        for(int m : moves) {
            for(int i = 0; i<board.length; i++) {
                if(board[i][m-1] > 0) {
                    crane = board[i][m-1];
                    board[i][m-1] = 0;
                    break;
                }
            }

            if(crane == 0) continue;
            if(crane>0 && basket.isEmpty()) {basket.push(crane); crane =0; continue;}
            if(basket.peek() == crane && !basket.isEmpty()) { basket.pop(); answer++;}
            else basket.push(crane);
            crane=0;
        }
        return answer*2;
    }
}
