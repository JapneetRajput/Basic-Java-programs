import java.util.*;
public class Loops14Advanced2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");      
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n)
                System.out.print("*");
                else{
                    System.out.print(j==1 || j==n?" ":"*");
                }
            }
            System.out.println();
        }
    }
}
