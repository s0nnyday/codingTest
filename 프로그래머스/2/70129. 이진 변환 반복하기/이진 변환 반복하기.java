class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int deletedZeroNum = 0; // 삭제된 0의 수
        int count  = 0; // 이진 변환의 횟수
        
        while (!s.equals("1")) { // s가 "1"이 될 때까지 반복
            int onesCount = 0; // 0이 아닌 1의 개수를 저장할 변수
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    onesCount++; // 0이 아닌 1의 개수 세기
                } else {
                    deletedZeroNum++; // 0인 경우 삭제된 0의 수 증가
                }
            }
            
            // 0이 아닌 1의 개수를 이진수로 변환하여 길이 구하기
            String binaryString = ""; // 이진수로 변환된 문자열을 저장할 변수
            while (onesCount > 0) {
                binaryString = (onesCount % 2) + binaryString; // 나머지를 앞에 추가
                onesCount /= 2; // 몫을 다시 계산
            }
            
            s = binaryString; // 변환된 이진수를 s에 저장
            
            
            count++; // 이진 변환 횟수 증가
        }
        
        
        // deletedZeroNum,count 를 answer 에 담기
        answer[0] = count;
        answer[1] = deletedZeroNum;
        
        
        return answer;
    }
}