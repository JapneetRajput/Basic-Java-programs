import java.util.*;
public class Loops6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt(),sum;
        for(;true;){
            sum=0;
            while(n!=0){
                sum += (n)%10;
                n/=10;
            }
            if(sum<0||sum>9)
                n=sum;
            else
                break;
        }
        System.out.print(sum);
    }
}
