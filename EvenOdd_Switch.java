import java.util.Scanner;
public class EvenOdd_Switch {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        switch(n%2){
        case 1:
            System.out.print(n + " is odd.");
            break;
        case 0:
            System.out.print(n + " is even.");
        }
    }
}