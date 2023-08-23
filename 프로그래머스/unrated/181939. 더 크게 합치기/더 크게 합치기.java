class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int resultA = Integer.parseInt((a+"")+(b+""));
        int resultB = Integer.parseInt((b+"")+(a+""));
        answer = Integer.max(resultA,resultB);
        return answer;
    }
}