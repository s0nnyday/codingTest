class Solution {
    public long solution(int a, int b) {
        long answer = a;
        if(a!=b) {
        	answer = (long)(a+b)*(Math.abs(a-b)+1)/2;
        }
        return answer;
    }
}