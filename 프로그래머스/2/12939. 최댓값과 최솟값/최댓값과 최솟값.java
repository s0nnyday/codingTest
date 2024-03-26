import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" ");
        //Integer[] intArray = new Integer[array.length];
        
        int max, min, n;
        max = Integer.parseInt(array[0]);
        min = Integer.parseInt(array[0]);
        
        for(int i=0; i<array.length; i++) {
            //intArray[i] = Integer.parseInt(array[i]);
            n = Integer.parseInt(array[i]);
            if(min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
            
        }
        //Arrays.sort(intArray);
        
        // answer += intArray[0] + " " + intArray[array.length-1];
        answer += min + " " + max;
        
        return answer;
    }
}