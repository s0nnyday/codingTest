class Solution {
    public long solution(int a, int b) {
        long answer = a;
        if(a!=b) {
        	//항의 개수
        	int n= Math.abs(a-b)+1;
        	System.out.println("n : "+n);
        	answer = (long)(a+b)*n/2;
        }
        return answer;
    }
}