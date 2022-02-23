class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int idx = 0; idx < n; idx++) {
            answer[idx] = "";
        }
        for(int i = 0; i < n; i++) {
            String a1 = String.format("%"+n+"s", Integer.toBinaryString(arr1[i]));
            String a2 = String.format("%"+n+"s", Integer.toBinaryString(arr2[i]));
            for(int k = 0; k < n; k++) {
                if(a1.charAt(k) == '1' || a2.charAt(k) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}
