class Solution {
    public int solution(int num) {
        int count = 0;
        
        if (num == 1){ // 주어진 수가 1인 경우에는 0을 반환
            return 0;
        }
        
        for(count=1;count<=500;count++) {
            
            if(num%2 == 1) {
                num = num*3+1;
            }else {
                num /= 2;
            }
            
            if(num == 1) {
                return count;
            }
            
            if(count==500 && num!=1) {
                return -1;
            }
            
        }
        
//         while(count<=500 && num!=1) {
//             if(count<500 && num==1) { // 500번 반복하기 전에 1이 되면 count 반환
//                 return count;
//             }
            
//             if(count==500 && num!=1) { // 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환
//                 return -1;
//             }
            
//             if(num%2 == 0) {
//                 num /= 2;
//                 count++;
//                 continue;
//             }
            
//             if(num%2 == 1) {
//                 num = (num*3)+1;
//                 count++;
//                 continue;
//             }
//         }
        
        return count;
    }
}