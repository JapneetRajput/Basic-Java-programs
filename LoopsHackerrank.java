import java.util.*;
public class LoopsHackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i<q; i++){
            int a = scan.nextInt(), b = scan.nextInt() , n = scan.nextInt(), s;
            for(int j = 1; j<=n; j++){
                s = (a + ((int)Math.pow(2,j)-1)*(b));
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}