import java.util.*;
public class Methods2Alt {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.printf(n + " is " + (isPrime(n)?" a prime":"not a prime") + " number.");
        System.out.println();
        System.out.print("Enter the range: ");
        printPrimeBetween(scan.nextInt(), scan.nextInt());
    }
    public static boolean isPrime(int n){
        int i;
        boolean isPrime= true;
        for(i=2; i<n/2; i++){
            if(n%i==0)
                isPrime=false;
        }
        return isPrime;
    }
    public static void printPrimeBetween(int m,int n){
        for(; m<=n; m++){
            if(isPrime(m))
                System.out.print(m + " ");
        }
    }
}

