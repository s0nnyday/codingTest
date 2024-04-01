class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i=1; i<=n; i++) { //i=1~8까지 반복
            int sum = 0;
            
            for (int j=i;j<=n;j++) {
                sum+=j;
                if(sum==n) { // sum이 n 이랑 같으면 count 추가o
                    count++;
                    break;
                }
                if(sum>n) { // sum이 n 넘으면 종료 count 추가x
                    break;
                }
            }
            
        }
        return count;
    }
}