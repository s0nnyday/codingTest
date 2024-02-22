class Solution {
    public String solution(String s) {
        String answer = "";
        
        int sLength = s.length();
        
        if(sLength%2==1) {
            answer = s.substring((sLength+1)/2-1,(sLength+1)/2);
        } else {
            answer = s.substring(sLength/2-1,sLength/2+1);
        }
        
        return answer;
    }
}