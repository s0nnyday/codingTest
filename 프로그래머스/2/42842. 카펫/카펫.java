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
        
        for (int i = 0; i < divisorsArray.length; i++) {
            int width = divisorsArray[i];
            int height = yellow / width;

            // 갈색 타일의 개수 계산
            int border = (width + 2) * (height + 2) - yellow;
            if (border == brown) {
                answer[0] = Math.max(width + 2, height + 2);
                answer[1] = Math.min(width + 2, height + 2);
                break;
            }
        }
        
        return answer;
    }
}