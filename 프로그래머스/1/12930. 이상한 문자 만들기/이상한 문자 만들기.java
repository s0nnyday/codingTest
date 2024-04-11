class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] arrays = s.split(" ",-1);
        for(int i=0; i<arrays.length;i++) {
            Boolean isEvenNum = true;
            String word = arrays[i];
            
            for(char c : word.toCharArray()) {
                if(isEvenNum) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                isEvenNum = !isEvenNum;
            }
            if (i < arrays.length - 1) {
                answer.append(" "); // 마지막 단어 이후에는 공백을 추가하지 않음
            }
        }
        
        return answer.toString();
    }
}