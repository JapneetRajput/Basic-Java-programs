import java.util.*;
public class Loops4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt(),i,c=0;
        for(i=2; i<n; i++){
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
}
