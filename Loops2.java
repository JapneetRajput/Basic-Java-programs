import java.util.*;
public class Loops2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        do{
            System.out.print("Enter a number: ");
            sum += scan.nextInt();
            System.out.println("Sum = " + sum);
        }while(sum<100);
        System.out.println("Sum > 100");
        System.out.print("Done");
    }
}
