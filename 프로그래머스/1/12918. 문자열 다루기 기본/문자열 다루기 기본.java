class Solution {
    public boolean solution(String s) {
        
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        if(s.length()!=4 && s.length()!=6) {
            return false;
        }
        
        for(int i=0 ; i<arr.length ; i++) {
            if(Character.isLetter(arr[i])) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}