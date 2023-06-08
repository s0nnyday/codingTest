import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a="";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(Character.isUpperCase(ch)){
                a+=Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                a+=Character.toUpperCase(ch);
            }else {
                a+=ch;
            }
        }
        System.out.print(a);
    }
}