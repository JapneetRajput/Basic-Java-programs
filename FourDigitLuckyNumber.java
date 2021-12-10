import java.util.*;
public class FourDigitLuckyNumber {
    public static void main(String args[]){
        System.out.print("Enter a four digit number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=1000&&n<=9999){
            int firstDigit = (n/1000)%10, secondDigit = (n/100)%10, thirdDigit = (n/10)%10, fourthDigit = n%10;
            if(( firstDigit + secondDigit ) == ( thirdDigit + fourthDigit))
                System.out.print(n + " is a Lucky number.");
            else 
                System.out.print(n + " is not a Lucky number.");
            }
        else 
            System.out.print(n + " is not a four digit number.");
    }
}
