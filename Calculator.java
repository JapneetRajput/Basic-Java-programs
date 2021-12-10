import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        double a,b;
        char c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        a = s.nextInt();
        System.out.print("Enter num2 : ");
        b = s.nextInt();
        System.out.print("Enter operator : ");
        c = s.next().charAt(0);
        if(c =='+')
            System.out.print(a + " + " + b + " = " + (a+b));
        else if(c == '-')
            System.out.print(a + " - " + b + " = " + (a-b));
        else if(c == '*')
            System.out.print(a + "*" + b + " = " + (a*b));
        else if(c == '/')
            System.out.print(a + "/" + b + " = " + (a/b));
        else 
            System.out.print("Invalid operator.");
    }
}
