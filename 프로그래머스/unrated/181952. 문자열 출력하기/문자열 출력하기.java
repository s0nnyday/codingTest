import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int b = str.length();
        
        if(b>=1 && b<=1000000){
            System.out.print(str);
        }
    }
}