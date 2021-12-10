import java.util.*;
public class Loops10 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine(),reverse = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        System.out.println(reverse.equals(s)?"The string is a palindrome.":"The string is not a palindrome.");
    }
}
