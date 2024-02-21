class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int stringLength = phone_number.length();
        for(int i=0;i<stringLength-4;i++) {
            answer+="*";
        }
        
        answer+=phone_number.substring(stringLength-4,stringLength);
        
        return answer;
    }
}