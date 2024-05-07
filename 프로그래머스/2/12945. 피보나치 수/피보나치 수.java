class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num0 = 0;
        int num1 = 1;

        int num = 0;
        for(int i=0;i<n-1;i++) {
            num = (num0 + num1) % 1234567;
            num0 = num1;
            num1 = num;
        }
        
        answer = num1 % 1234567;
        return answer;
    }
}