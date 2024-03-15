import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strNum=n+"";
        String []arrNum = strNum.split("");
        Arrays.sort(arrNum);
        String result="";
        for(int i=0;i<arrNum.length;i++) {
        	result += arrNum[arrNum.length-1-i];
        }
        return Long.parseLong(result);
    }
}