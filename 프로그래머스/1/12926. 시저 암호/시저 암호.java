class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if(Character.isLetter(c)) {
                if(Character.isUpperCase(c)) {
                    char upperCase = (char)('A'+(c-'A'+n)%26);
                    answer.append(upperCase);
                }
                if(Character.isLowerCase(c)) {
                    char lowerCase = (char)('a'+(c-'a'+n)%26);
                    answer.append(lowerCase);
                }
                
            } else {
                answer.append(c);
            }
        }
        
        
        return answer.toString();
    }
}