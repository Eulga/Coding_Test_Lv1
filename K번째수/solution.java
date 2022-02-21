import java.util.*;

//List의 subList를 이용하려했으나 subList로 뽑은 List는 원본에 영향을 주기 때문에 정렬시 원본도 해당 범위가 정렬된다.

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> abc = new ArrayList<>();

        int[] answer = new int[commands.length];
        int i = 0;
        for(int[] command : commands) {
            if(command[0] != command[1]) {
                for(int c = command[0]-1; c < command[1]; c++) {
                    abc.add(array[c]);
                }
                abc.sort(Comparator.naturalOrder());
                answer[i] = abc.get(command[2]-1);
            } else {
                answer[i] = array[command[0]-1];
            }
            System.out.println(answer[i]);
            abc.clear();
            i++;
        }
        return answer;
    }
}
