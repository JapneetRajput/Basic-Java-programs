import java.util.*;
public class Loops7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int n= scan.nextInt(),i,i1=1,i2=1;
        if(n>=1){
            System.out.print(i1 + " ");
        }
        if(n>=2){
            System.out.print(i2 + " ");
        }
        for(i=3;i<=n;i++){
            if(i%2==1){
                i1 = i1 + i2;
                System.out.print(i1 + " ");
            }
            else{
                i2 = i1 + i2;
                System.out.print(i2 + " ");
            }
        }
    }
}
