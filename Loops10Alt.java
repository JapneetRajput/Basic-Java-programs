import java.util.*;
public class Loops10Alt {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        boolean isPalindrome = true;
        for(int i=0,j = s.length() - 1;i<j;i++,j--){
            if(s.charAt(i)==s.charAt(j))
                continue;
            isPalindrome = false;
        }
        System.out.println(isPalindrome?"The string is a palindrome.":"The string is not a palindrome.");
    }
}
