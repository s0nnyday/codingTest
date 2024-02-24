import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        char[] c =s.toCharArray();
        Arrays.sort(c);
        
        String result = new StringBuilder(new String(c)).reverse().toString();
        
        System.out.println(c);
        return result;
    }
}