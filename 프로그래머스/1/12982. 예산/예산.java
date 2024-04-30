import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int count = 0;
        int result = 0;
        for(int i=0;i<d.length;i++) {

            result += d[i];

            if(result > budget) {
                break;
            }
            
            count++;

        }
        
        answer = count;
        
        return answer;
    }
}