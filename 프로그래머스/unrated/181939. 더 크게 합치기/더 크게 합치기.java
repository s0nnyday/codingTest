class Solution {
    public int solution(int a, int b) {
        int resultA = Integer.parseInt((a+"")+(b+""));
        int resultB = Integer.parseInt((b+"")+(a+""));
        return Integer.max(resultA,resultB);
    }
}