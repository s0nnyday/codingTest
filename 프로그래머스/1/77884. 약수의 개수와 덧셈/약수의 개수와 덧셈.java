class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++) {
            
            //left~right 1씩 더하면서 약수 짝수면 더하고, 홀수면 빼기
            int count = 0;
            
            for(int j=1;j<=i;j++) { // 약수의 개수 세는 반복문
                if(i%j==0) { // 나머지 0이면 약수 개수 증가
                    count++;
                }
            }
            
            if(count%2 == 0) {
                answer += i;
            } else{
                answer -= i;
            }
            
        }
        
        return answer;
    }
}