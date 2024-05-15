import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        List<Integer> divisorsList = new ArrayList<>();

        // 약수 구하기
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                divisorsList.add(i);
            }
        }
        
        // 리스트를 배열로 변환
        int[] divisorsArray = divisorsList.stream().mapToInt(i -> i).toArray();
        int len = divisorsArray.length;
        
        for(int i = 0; i < len; i++) {
            
            int result = 4 + (divisorsArray[i] * 2) + (divisorsArray[len - 1 - i] * 2);

            if(result == brown) {
                answer[0] = divisorsArray[len - 1 - i]+2;
                answer[1] = divisorsArray[i]+2;
                break;
            }
        }
        
        return answer;
    }
}