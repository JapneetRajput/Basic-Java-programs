import java.util.*;
public class Methods2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        isPrime(scan.nextInt());
        System.out.println();
        System.out.print("Enter the range: ");
        printPrimeBetween(scan.nextInt(), scan.nextInt());
    }
    public static void isPrime(int n){
        int c=0;
        for(int i=2; i<n; i++){
            if(n%i!=0){
                continue;
            }
            else{
                System.out.print(n + " is not a prime number.");
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.print(n + " is a prime number.");
        
    }
    public static void printPrimeBetween(int m,int n){
        for(; m<=n; m++){
            int c=0;
            for(int i=2; i<m; i++){
                if(m%i!=0){
                    continue;
                }
                else{
                    c=1;
                    break;
                }
            }
            if(c==0)
                System.out.print(m + " ");
        }
        
    }
}
