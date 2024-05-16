class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] c = s.toCharArray();
        answer[0] = -1;
        
        for(int i = 1; i<c.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(c[i] == c[j]) {
                    answer[i]=i-j;
                    break;
                }
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}