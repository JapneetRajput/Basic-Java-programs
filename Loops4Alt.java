import java.util.*;
public class Loops4Alt {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt(),i,c=0;
        boolean isPrime= true;
        for(i=2; i<n; i++){
            if(n%i==0)
                isPrime=false;
        }
        System.out.printf(n + " is " + (isPrime?" a prime":"not a prime") + " number.");
    }
}