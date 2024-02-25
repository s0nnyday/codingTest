class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long finalPrice = 0; // 최종 놀이기구 이용료
        
        for(int i=1 ; i<=count ; i++) {
            finalPrice += price * i;
        }
        
        long needMoney = (long)finalPrice - money; // 부족한 금액
        
        if(needMoney >= 0) {
            answer = needMoney;
        }

        return answer;
    }
}