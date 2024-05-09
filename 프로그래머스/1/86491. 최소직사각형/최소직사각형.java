class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 1. 한 행에서 긴 것/작은 것 구분 2. 각각 긴 것 중에 가장 큰 값, 작은 것 중에 가장 큰 값 찾기
        
        int longgerSize = 0;
        int shorterSize = 0;
        
        int sizesLength = sizes.length;
        
        for(int i=0;i<sizesLength;i++) {
            int longSize = 0;
            int shortSize = 0;
            if(sizes[i][0]>=sizes[i][1]) {
                longSize = sizes[i][0];
                shortSize = sizes[i][1];
            } else {
                longSize = sizes[i][1];
                shortSize = sizes[i][0];
            }
            
            if(longSize>longgerSize) {
                longgerSize = longSize;
            }
            if(shortSize>shorterSize) {
                shorterSize = shortSize;
            }
        }
        
        answer = longgerSize * shorterSize;
        
        return answer;
    }
}