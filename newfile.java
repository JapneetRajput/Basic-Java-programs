import java.util.Scanner;
public class newfile {
    public static void main(String[] args){
        Customber customber = new Customber();
        customber.accept();
        customber.display();
    }
}

class PersonInfo{
    String id,name;
}
class Account extends PersonInfo{
    int accno;
}
class Customber extends Account{
    int balance;
    void accept(){
        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("Enter person id: ");
        id = scan.nextLine(); 
        System.out.print("Enter person name: ");
        name = scan.nextLine();
        System.out.print("Enter account number: ");
        accno = scan.nextInt();
        System.out.print("Enter balance: ");
        balance = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Account number is " + scan.nextLine() + scan.nextInt());
        }
    }
    void display(){
        System.out.println("Person id is " + id + "\n Person Name is " + name + "\n Account Number is " + accno + "\n Balance is " + balance);
    }
}