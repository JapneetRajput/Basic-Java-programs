import java.util.*;
public class Loops12Variation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");      
        int n = scan.nextInt(),i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++)
                System.out.print(" ");
            for(j=n-i;j<n+i-1;j++)
                System.out.print("*");
//            for(j=n+1;j<n+i;j++)
//                System.out.print("*");
            System.out.println();
        }
    }
}
