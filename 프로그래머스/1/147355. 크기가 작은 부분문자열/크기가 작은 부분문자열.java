class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        for(int i=0 ; i<tLength-pLength+1 ; i++) {
            String result = t.substring(i,i+pLength);
            
            if(Long.parseLong(result)<=Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}