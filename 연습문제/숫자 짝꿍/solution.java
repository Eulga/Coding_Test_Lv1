/*
  X를 기준으로 반복문을 돌리고 Y안에 있는 값을 지워내면서 값을 찾고 정렬 한번 역정렬 한번 하면서
  실패를 하다가 포기하고 힌트 몇개 보고 뭔가 깨달았으나 제대로 코드가 안나와서 구글링했습니다.
  원하는 정확한 답이 있었고 도저히 다르게 못 만들 것 같아서 그냥 카피 해버렸습니다.
*/

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xx = new int[10];
        int[] yy = new int[10];
        
        countNumber(X, xx);
        countNumber(Y, yy);
        
        for(int i = 9; i >= 0; i--) {
            while(xx[i] != 0 && yy[i] != 0) {
                xx[i]--;
                yy[i]--;
                
                sb.append(i);
            }
        }
        
        if(sb.length() == 0) return "-1";
        else if(sb.toString().startsWith("0")) return "0";
        else return sb.toString();
        
    }
    
    public void countNumber(String str, int[] arr) {
        for(int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}
