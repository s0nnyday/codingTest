import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // 첫 번째 숫자는 무조건 결과에 추가
        resultList.add(arr[0]);
        
        // 배열을 순회하면서 연속적으로 나타나는 숫자를 제거하고 남은 수들을 결과에 추가
        for(int i = 1; i < arr.length; i++) {
            // 현재 숫자와 이전 숫자가 다르면 결과에 추가
            if(arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }
        
        // ArrayList를 int 배열로 변환하여 반환
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}