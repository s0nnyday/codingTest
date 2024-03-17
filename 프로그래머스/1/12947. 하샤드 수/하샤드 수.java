class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String strX=x+"";
        int []arr = new int[strX.length()];
        int n=0;
        
        for(int i=0;i<strX.length();i++) {
        	n+=strX.charAt(i)-'0';
        }
        
        if(x%n!=0) {
        	answer = false;
        }
        
        return answer;
    }
}