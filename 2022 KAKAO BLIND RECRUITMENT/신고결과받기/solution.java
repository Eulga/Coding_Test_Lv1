import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //유저별 신고현황 Map생성
        HashMap<String,Set<String>> report_list = new HashMap<>();
        for(String id : id_list) {
            report_list.put(id, new HashSet<String>());
        }

        //각 유저가 신고한 유저 입력
        for(String re : report) {
            String[] s_re = re.split(" ");
            Set<String> li_re = report_list.get(s_re[0]);
            for(int i=1;i<s_re.length;i++) {
                li_re.add(s_re[i]);
            }
        }

        //신고당한 유저 목록 추출(입력부분에서 중복 신고 제거 완료됨)
        List<String> total_re_list = new ArrayList<>();
        for(String key : report_list.keySet()) {
            for(String id_re : report_list.get(key)) {
                total_re_list.add(id_re);
            }
        }

        //신고당한 횟수 체크 후 정지사유 충분 유저 목록 생성
        List<String> sus_List = new ArrayList<>();
        Set<String> set = new HashSet<>(total_re_list);
        for(String str : set) {
            if(Collections.frequency(total_re_list, str) >= k) {
                sus_List.add(str);
            }
        }

        //메일 개수 체크
        List<Integer> mail_num = new ArrayList<>();
        for(String key : id_list) {
            int num = 0;
            for(String str : sus_List) {
                if(report_list.get(key).contains(str)) {
                    num++;
                }
            }
            mail_num.add(num);
        }

        //제출값 생성
        int[] answer = new int[mail_num.size()];
        for(int i=0; i<answer.length;i++) {
            answer[i] = mail_num.get(i);
        }
        return answer;
    }
    
}
