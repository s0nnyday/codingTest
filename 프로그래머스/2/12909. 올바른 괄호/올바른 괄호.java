class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int number = 0;
        
        for (int i=0; i<s.length(); i++) {
            
            String str = s.substring(i,i+1);
            
            if(number==-1) {
                answer = false;
                break;
            }
            if(str.equals("(")) {
                number += 1;
            }
            if(str.equals(")")) {
                number -= 1;
            }
        }
        
        if(number != 0) {
            answer = false;
        }

        return answer;
    }
}