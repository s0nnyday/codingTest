import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int l=str.length();
        
        if( l>=1 && l<=10 && n>=1 && n<=5 ){
            System.out.print(str.repeat(n));
        }
    }
}