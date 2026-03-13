import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        for(int i=0; i < a.length(); i++) {
            char ch = a.charAt(i);
        
            if(65 <= ch && ch <= 90) {
                ch = Character.toLowerCase(ch);
                System.out.print(ch);
            } else if(97 <= ch && ch <= 122) {
                ch = Character.toUpperCase(ch);
                System.out.print(ch);
            }
        }
    }
}