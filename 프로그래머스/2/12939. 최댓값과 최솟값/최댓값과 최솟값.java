import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" ");
        Integer[] intArray = new Integer[array.length];
        for(int i=0; i<array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(intArray);
        
        answer += intArray[0] + " " + intArray[array.length-1];
        
        return answer;
    }
}