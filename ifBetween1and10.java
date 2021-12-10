import java.util.Scanner;
public class ifBetween1and10 {
    public static void main(String args[]) {
        System.out.print("Enter a number between 1 and 10 : ");
        Scanner s = new Scanner(System.in);
        while(true){
            int n = s.nextInt();
            if(n>=1&&n<10){
                System.out.print(n + " is between 1 and 10. Thanks!");
                break;
            }
            else
                System.out.print(n + " is not between 1 and 10. Try again : ");
        }
    }
}