import java.util.*;
public class Loops8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        for(int i=0;i<n;i++){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
