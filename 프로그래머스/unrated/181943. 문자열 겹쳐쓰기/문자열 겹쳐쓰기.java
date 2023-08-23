class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
		String answer="";
		if(my_string.length()==overwrite_string.length()) {
			answer=overwrite_string;
		}else if(s==my_string.length()-overwrite_string.length()){
			String a = my_string.substring(0,s);
			String b = my_string.substring(overwrite_string.length()+s);
			answer = a+overwrite_string+b;
		}else {
			String a = my_string.substring(0,s);
			String b = my_string.substring(overwrite_string.length()+s);
			answer = a+overwrite_string+b;
		}		
		System.out.println(answer);
		return answer;
    }
}