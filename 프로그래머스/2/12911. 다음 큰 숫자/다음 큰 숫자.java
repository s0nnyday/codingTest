class Solution {
    public int solution(int n) {
        int answer = 0;
        // 주어진 수 이진수로 바꾸고 1의 개수를 센다. 수를 키워가며 1의 개수 똑같은 수를 찾아 반환한다.
        
        int countOne = countOneBits(n);
        int nextNumber = n+1;
        while(countOne != countOneBits(nextNumber)) {
            
            nextNumber++;
        }
        
        answer = nextNumber;
        return answer;
    }
 
    // 주어진 수 이진수로 변환하면서 1의 개수 세서 반환하는 메서드
    public int countOneBits(int num) {
        
        int count = 0;
        
        while(num>0) {
            if(num%2 == 1) {
                count++;
            };
            num /= 2;
        }
        
        return count;
    }
}