class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; 
        
        int gcd = calculateGCD(n,m);
        int lcm=(n*m)/gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    private int calculateGCD(int n, int m) {
        
        int gcd = 0;
        
        while(true) {
            int r = m%n;
            
            if(r==0) {
                gcd = n;
                break;
            }
            if(r!=0) {
                m=n;
                n=r;
            }
        }
        
        return gcd;
    }
}