class Solution {
    public int[] solution(int[] arr) {
        
        // 배열 길이가 1이면 -1 넣어서 반환
        if(arr.length<=1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        
        // 최솟값 찾기
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        
        // 배열 길이 줄이고, 새 배열 생성
        int []answer = new int[arr.length-1];
        int index = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != min) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}