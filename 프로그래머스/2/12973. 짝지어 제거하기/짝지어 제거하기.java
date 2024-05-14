class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1); // 짝을 이루는 문자 제거
            } else {
                sb.append(c); // 짝을 이루지 않는 경우 문자 추가
            }
        }
        
        return sb.length() == 0 ? 1 : 0; // 모두 제거되었는지 여부 확인 후 반환
    }
}
