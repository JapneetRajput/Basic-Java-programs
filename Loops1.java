import java.util.*;
public class Loops1 {
    public static void main(String args[]){
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0)
                System.out.print(i + " ");
        } 
        System.out.println();
        for(int i=n; i>=1; i--){
            if(i%2==0)
                System.out.print(i + " ");
        } 
    }
    
}
