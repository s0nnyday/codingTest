class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int sumExistNumber = 0;
        
        
        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<10;j++)
                if(numbers[i]==j) {
                    sumExistNumber+=j;
                }
        }
        
        return answer-sumExistNumber;
    }
}