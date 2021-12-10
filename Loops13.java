import java.util.*;
public class Loops13 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");      
        int n = scan.nextInt(),i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++)
                System.out.print(" ");
            for(j=n-i;j<n+i-1;j++){
                if(i==n)
                    System.out.print("*");
                else{
                if(j==n-i || j==n+i-2)
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
