class Solution {
    public String solution(String s) {
        String answer = "";
        
        String str = s.toLowerCase();
        String[] arrays = str.split("");
        
        boolean isFirst = true;
        
        for(String c :arrays) {
            if (isFirst) {
                answer += c.toUpperCase();
                isFirst = false;
            } else {
                answer += c;
            }
            
            if(c.equals(" ")) {
                isFirst = true;
            } else {
                isFirst = false;
            }
        }

        return answer;
    }
}