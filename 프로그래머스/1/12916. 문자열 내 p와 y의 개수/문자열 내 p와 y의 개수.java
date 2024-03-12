class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str=s.toUpperCase();
        int cntP=0;
        int cntY=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='P'){
                cntP++;
}else if(str.charAt(i)==('Y')){
cntY++;
}
}
        if(cntY!=cntP){
answer=false;
}
        return answer;
    }
}