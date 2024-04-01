class Solution {
    public int solution(int n) {
        int count = 0; // 자기 자신은 포함이니까
        
        for (int i=1; i<=n; i++) { //i=1~8까지 반복
            int sum = 0;
            // System.out.println("i 시작: " + i);
            
            for (int j=i;j<=n;j++) {
                // System.out.println("j 시작: "+ j);
                sum+=j;
                // System.out.println("sum: " + sum);
                if(sum==n) { // sum이 n 이랑 같으면 count++;
                    count++;
                    //System.out.println("count 증가 o: " + count);
                    break;
                }
                if(sum>n) { // sum 이 n 넘으면 종료;
                    //System.out.println("count 증가 x:" + count);
                    break;
                }
                // System.out.println("--j반복문 끝--");
            }
            
            // System.out.println("--i반복문 끝--");
        }
        return count;
    }
}