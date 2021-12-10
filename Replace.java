// ASSIGNMENT 1 (Q7)
import java.util.*;
class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String s = sc.nextLine();
        System.out.println("THE ENTERED STRING IS: " +s);
        System.out.println("THE NEW STRING IS: " +s.replace("an","the"));
    }
}