//int long 리턴타입을 자세히 보도록 하자!!!!!!!!!!!!!!!!!!!!!!!!!!!

class Solution {
    public long solution(int price, int money, int count) {
        //int -> long
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += price*i;
        }
        return money>=total ? 0:total-money;
    }
}
