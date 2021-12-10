import java.util.*;
public class Loops3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt(),i;
        int sum = 0;
        System.out.print("Strict divisors are: ");
        for(i=1; i<=num; i++){
            if(num%i==0) {
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println();   
        System.out.print("Sum = " + sum);       
    }
}
