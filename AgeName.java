import java.util.*;
public class AgeName{
    public static void main(String arg[]) {

        System.out.print("My name is " + name() + " and I am " + age() + " years old.");        
    }
    public static String age(){
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
    }
    public static String name(){
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        return s;
    }
    
}
