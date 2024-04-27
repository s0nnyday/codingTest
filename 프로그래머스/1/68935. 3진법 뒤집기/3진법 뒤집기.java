class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String tenaryString = ""; // 3진법으로 변환한 수 담기
        while(n>0) {
            tenaryString += n%3;
            n /= 3;
        }
        
        long tenaryNum = Long.parseLong(tenaryString.toString()); // long 자료형으로 변환
        
        long result = 0; // 10진법으로 더해갈 수
        int num = 1; // 3진법 변환을 위해 3 곱해나갈 수
        while(tenaryNum!=0) {
            
            result += (tenaryNum%10)*num;
            tenaryNum = tenaryNum/10;
            num *= 3;
            
        }
        
        answer = (int)result;
        
        return answer;
    }
}