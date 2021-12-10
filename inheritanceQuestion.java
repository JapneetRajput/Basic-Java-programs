import java.util.*;
class addition extends inheritanceQuestion {
    int sum;
    void add(){
        sum = num1 + num2;
        System.out.println("Sum= " + sum);
    }
}
public class inheritanceQuestion {
    int num1, num2;
    public void accept(int a, int b){
        num1= a;
        num2=b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        addition add = new addition();
        System.out.println("Enter two values: ");
        int c = scan.nextInt(), d = scan.nextInt();
        add.accept(c,d);
        add.add();
    }
}




