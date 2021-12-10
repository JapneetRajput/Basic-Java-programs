import java.util.*;
public class Loops9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
